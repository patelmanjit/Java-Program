import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InvestmentCalculator extends JFrame implements ActionListener {
    private JTextField amountField, yearField, interestRateField, futureValueField;
    private JButton calculateButton;

    public InvestmentCalculator() {
        // Set up the user interface
        super("Investment Value Calculator");
        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        inputPanel.add(new JLabel("Amount: "));
        amountField = new JTextField();
        inputPanel.add(amountField);
        inputPanel.add(new JLabel("Years: "));
        yearField = new JTextField();
        inputPanel.add(yearField);
        inputPanel.add(new JLabel("Interest rate (%): "));
        interestRateField = new JTextField();
        inputPanel.add(interestRateField);
        inputPanel.add(new JLabel("Future value: "));
        futureValueField = new JTextField();
        futureValueField.setEditable(false);
        inputPanel.add(futureValueField);
        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(calculateButton);
        Container contentPane = getContentPane();
        contentPane.add(inputPanel, BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            try {
                // Get the input values and compute the future value
                double amount = Double.parseDouble(amountField.getText());
                int years = Integer.parseInt(yearField.getText());
                double interestRate = Double.parseDouble(interestRateField.getText());
                double futureValue = amount * Math.pow(1 + interestRate / 100, years);
                futureValueField.setText(String.format("%.2f", futureValue));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input");
            }
        }
    }

    public static void main(String[] args) {
        InvestmentCalculator calculator = new InvestmentCalculator();
    }
}
