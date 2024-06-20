package M2024_06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class FinancialManager extends JFrame {
    private double currentBalance;
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private JTextField initialBalanceField;
    private JTextArea transactionArea;
    private JTextField dateField;
    private JTextField amountField;
    private JComboBox<String> typeComboBox;
    private JLabel balanceLabel;
    private JLabel dailyChangeLabel;
    private JLabel monthlyChangeLabel;
    private JLabel yearlyChangeLabel;
    
    public FinancialManager() {
        setTitle("Financial Manager");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 초기 자금 설정
        JPanel initialBalancePanel = new JPanel();
        initialBalancePanel.add(new JLabel("Initial Balance:"));
        initialBalanceField = new JTextField(10);
        initialBalancePanel.add(initialBalanceField);
        JButton setBalanceButton = new JButton("Set Balance");
        initialBalancePanel.add(setBalanceButton);

        // 거래 입력 패널
        JPanel transactionPanel = new JPanel();
        transactionPanel.setLayout(new GridLayout(5, 2));
        transactionPanel.add(new JLabel("Date (yyyy-MM-dd):"));
        dateField = new JTextField();
        transactionPanel.add(dateField);
        transactionPanel.add(new JLabel("Amount:"));
        amountField = new JTextField();
        transactionPanel.add(amountField);
        transactionPanel.add(new JLabel("Type:"));
        typeComboBox = new JComboBox<>(new String[]{"Income", "Expense"});
        transactionPanel.add(typeComboBox);
        JButton addTransactionButton = new JButton("Add Transaction");
        transactionPanel.add(addTransactionButton);

        // 재정 상태 표시
        JPanel statusPanel = new JPanel();
        statusPanel.setLayout(new GridLayout(4, 1));
        balanceLabel = new JLabel("Current Balance: ");
        statusPanel.add(balanceLabel);
        dailyChangeLabel = new JLabel("Daily Change: ");
        statusPanel.add(dailyChangeLabel);
        monthlyChangeLabel = new JLabel("Monthly Change: ");
        statusPanel.add(monthlyChangeLabel);
        yearlyChangeLabel = new JLabel("Yearly Change: ");
        statusPanel.add(yearlyChangeLabel);

        // 거래 내역 표시
        transactionArea = new JTextArea();
        transactionArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(transactionArea);

        // 저장 버튼
        JButton saveButton = new JButton("Save Transactions");

        // 레이아웃 설정
        add(initialBalancePanel, BorderLayout.NORTH);
        add(transactionPanel, BorderLayout.CENTER);
        add(statusPanel, BorderLayout.EAST);
        add(scrollPane, BorderLayout.SOUTH);
        add(saveButton, BorderLayout.WEST);

        // 이벤트 핸들러
        setBalanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    currentBalance = Double.parseDouble(initialBalanceField.getText());
                    updateBalanceLabel();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid initial balance.");
                }
            }
        });

        addTransactionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String date = dateField.getText();
                    double amount = Double.parseDouble(amountField.getText());
                    String type = typeComboBox.getSelectedItem().toString();
                    addTransaction(date, amount, type);
                    updateBalanceLabel();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid amount.");
                }
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int option = fileChooser.showSaveDialog(null);
                if (option == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    saveTransactionsToFile(file.getPath());
                }
            }
        });
    }

    private void addTransaction(String date, double amount, String type) {
        transactions.add(new Transaction(date, amount, type));
        if (type.equals("Income")) {
            currentBalance += amount;
        } else {
            currentBalance -= amount;
        }
        updateTransactionArea();
        updatePercentageChanges();
    }

    private void updateBalanceLabel() {
        balanceLabel.setText("Current Balance: " + currentBalance);
    }

    private void updateTransactionArea() {
        transactionArea.setText("");
        for (Transaction transaction : transactions) {
            transactionArea.append(transaction.toString() + "\n");
        }
    }

    private void updatePercentageChanges() {
        // 현재 날짜를 기준으로 일/월/연 변화 계산
        double dailyChange = calculatePercentageChange(1);
        double monthlyChange = calculatePercentageChange(30);
        double yearlyChange = calculatePercentageChange(365);

        dailyChangeLabel.setText("Daily Change: " + dailyChange + "%");
        monthlyChangeLabel.setText("Monthly Change: " + monthlyChange + "%");
        yearlyChangeLabel.setText("Yearly Change: " + yearlyChange + "%");
    }

    private double calculatePercentageChange(int days) {
        Date currentDate = new Date();
        double pastBalance = currentBalance;
        for (Transaction transaction : transactions) {
            try {
                Date transactionDate = new SimpleDateFormat("yyyy-MM-dd").parse(transaction.getDate());
                long diff = (currentDate.getTime() - transactionDate.getTime()) / (1000 * 60 * 60 * 24);
                if (diff <= days) {
                    if (transaction.getType().equals("Income")) {
                        pastBalance -= transaction.getAmount();
                    } else {
                        pastBalance += transaction.getAmount();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return ((currentBalance - pastBalance) / pastBalance) * 100;
    }

    private void saveTransactionsToFile(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Date,Amount,Type\n");
            for (Transaction transaction : transactions) {
                writer.write(transaction.toString() + "\n");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving transactions.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FinancialManager manager = new FinancialManager();
            manager.setVisible(true);
        });
    }
}

class Transaction {
    private String date;
    private double amount;
    private String type;

    public Transaction(String date, double amount, String type) {
        this.date = date;
        this.amount = amount;
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return date + "," + amount + "," + type;
    }
}

