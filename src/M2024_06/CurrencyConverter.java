package M2024_06;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter extends JFrame {
    private JTextField operand1;
    private JComboBox<String> opSelection;
    private JLabel resultLabel;

    private static final float USD_RATE = 1120.50f; // 원화에서 달러
    private static final float JPY_RATE = 10.23f;   // 원화에서 엔화
    private static final float CNY_RATE = 174.54f;  // 원화에서 위엔화
    private static final float EUR_RATE = 1330.20f; // 원화에서 유로화

    public CurrencyConverter() {
        setTitle("환율 계산기");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel operand1Label = new JLabel("금액 (원화):");
        operand1Label.setBounds(30, 30, 100, 30);
        add(operand1Label);

        operand1 = new JTextField();
        operand1.setBounds(130, 30, 150, 30);
        add(operand1);

        JLabel operatorLabel = new JLabel("변환 통화:");
        operatorLabel.setBounds(30, 70, 100, 30);
        add(operatorLabel);

        String[] currencies = {"달러", "엔화", "위엔화", "유로화"};
        opSelection = new JComboBox<>(currencies);
        opSelection.setBounds(130, 70, 150, 30);
        add(opSelection);

        JButton calculateButton = new JButton("계산");
        calculateButton.setBounds(30, 110, 100, 30);
        add(calculateButton);

        resultLabel = new JLabel("결과: ");
        resultLabel.setBounds(150, 110, 200, 30);
        add(resultLabel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
    }

    private void calculate() {
        float won = Float.parseFloat(operand1.getText());
        String result = null;
        String operator = opSelection.getSelectedItem().toString();

        switch (operator) {
            case "달러":
                result = String.format("%.6f", won / USD_RATE);
                break;
            case "엔화":
                result = String.format("%.6f", won / JPY_RATE);
                break;
            case "위엔화":
                result = String.format("%.6f", won / CNY_RATE);
                break;
            case "유로화":
                result = String.format("%.6f", won / EUR_RATE);
                break;
            default:
                result = "알 수 없는 통화";
                break;
        }

        resultLabel.setText("결과: " + result);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }
}
