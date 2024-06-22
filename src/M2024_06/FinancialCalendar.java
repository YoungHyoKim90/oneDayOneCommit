package M2024_06;

import com.toedter.calendar.JCalendar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class FinancialCalendar extends JFrame {
	private JCalendar calendar;
	private JTextField amountField;
	private JTextArea transactionsArea;
	private JLabel totalLabel;
	private Map<Date, Double> transactions;

	public FinancialCalendar() {
		setTitle("Financial Calendar");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		calendar = new JCalendar();
		transactions = new HashMap<>();

		amountField = new JTextField(20);
		JButton addButton = new JButton("Add Amount");
		totalLabel = new JLabel("Total: 0원");

		transactionsArea = new JTextArea();
		transactionsArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(transactionsArea);

		JPanel inputPanel = new JPanel();
		inputPanel.add(new JLabel("Amount:"));
		inputPanel.add(amountField);

		inputPanel.add(addButton);

		add(calendar, BorderLayout.NORTH);
		add(inputPanel, BorderLayout.CENTER);
		add(scrollPane, BorderLayout.EAST);
		add(totalLabel, BorderLayout.SOUTH);

		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String amountText = amountField.getText().replace(",", "");
					double amount = Double.parseDouble(amountText);
					Date selectedDate = calendar.getDate();

					transactions.put(selectedDate, transactions.getOrDefault(selectedDate, 0.0) + amount);
					updateTransactionsArea();
					updateTotalLabel();
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Invalid amount. Please enter a valid number.");
				}
			}
		});

		amountField.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				addButton.doClick();
			}
		});
	}

	private void updateTransactionsArea() {
		transactionsArea.setText("");
		DecimalFormat df = new DecimalFormat("#,###원");

		for (Map.Entry<Date, Double> entry : transactions.entrySet()) {
			transactionsArea.append(new SimpleDateFormat("yyyy-MM-dd").format(entry.getKey()) + ": "
					+ df.format(entry.getValue()) + "\n");
		}
	}

	private void updateTotalLabel() {
		double total = transactions.values().stream().mapToDouble(Double::doubleValue).sum();
		DecimalFormat df = new DecimalFormat("#,###원");
		totalLabel.setText("Total: " + df.format(total));
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			FinancialCalendar calendar = new FinancialCalendar();
			calendar.setVisible(true);
		});
	}
}
