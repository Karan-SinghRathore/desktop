import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class CurrencyConverterUI extends JFrame implements ActionListener {
    private JTextField textField;
    private JComboBox<String> currencyFromComboBox;
    private JComboBox<String> currencyToComboBox;
    private JButton convertButton;

    private String[] currencies = {"USD", "EUR", "GBP", "JPY", "AUD", "CAD","INR"};

    public CurrencyConverterUI() {
        setTitle("Currency Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new FlowLayout());

        JLabel label1 = new JLabel("Amount:");
        add(label1);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(100, 30));
        add(textField);

        JLabel label2 = new JLabel("From:");
        add(label2);

        currencyFromComboBox = new JComboBox<>(currencies);
        add(currencyFromComboBox);

        JLabel label3 = new JLabel("To:");
        add(label3);

        currencyToComboBox = new JComboBox<>(currencies);
        add(currencyToComboBox);

        convertButton = new JButton("Convert");
        convertButton.addActionListener(this);
        add(convertButton);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double amount = Double.parseDouble(textField.getText());
        String fromCurrency = currencyFromComboBox.getSelectedItem().toString();
        String toCurrency = currencyToComboBox.getSelectedItem().toString();

        double convertedAmount = convertCurrency(amount, fromCurrency, toCurrency);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String result = decimalFormat.format(convertedAmount);

        JOptionPane.showMessageDialog(this, amount + " " + fromCurrency + " = " + result + " " + toCurrency);
    }

    private double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        // Implement your currency conversion logic here
        double conversionRate = 1.0;
        if (fromCurrency.equals("USD")) {
            if (toCurrency.equals("EUR")) {
                conversionRate = 0.89;
            } else if (toCurrency.equals("GBP")) {
                conversionRate = 0.78;
            } else if (toCurrency.equals("JPY")) {
                conversionRate = 108.77;
            } else if (toCurrency.equals("AUD")) {
                conversionRate = 1.44;
            } else if (toCurrency.equals("CAD")) {
                conversionRate = 1.34;
            }
            else if (toCurrency.equals("INR")) {
                conversionRate = 82.73;
            }
        } else if (fromCurrency.equals("EUR")) {
            if (toCurrency.equals("USD")) {
                conversionRate = 1.12;
            } else if (toCurrency.equals("GBP")) {
                conversionRate = 0.88;
            } else if (toCurrency.equals("JPY")) {
                conversionRate = 123.18;
            } else if (toCurrency.equals("AUD")) {
                conversionRate = 1.63;
            } else if (toCurrency.equals("CAD")) {
                conversionRate = 1.51;
            } else if (toCurrency.equals("INR")) {
                conversionRate = 88.35;
            }
        } else if (fromCurrency.equals("GBP")) {
            if (toCurrency.equals("USD")) {
                conversionRate = 1.28;
            } else if (toCurrency.equals("EUR")) {
                conversionRate = 1.14;
            } else if (toCurrency.equals("JPY")) {
                conversionRate = 140.24;
            } else if (toCurrency.equals("AUD")) {
                conversionRate = 1.86;
            } else if (toCurrency.equals("CAD")) {
                conversionRate = 1.72;
            } else if (toCurrency.equals("INR")) {
                conversionRate = 102.99;
            }
        } else if (fromCurrency.equals("JPY")) {
            if (toCurrency.equals("USD")) {
                conversionRate = 0.0092;
            } else if (toCurrency.equals("EUR")) {
                conversionRate = 0.0081;
            } else if (toCurrency.equals("GBP")) {
                conversionRate = 0.0071;
            } else if (toCurrency.equals("AUD")) {
                conversionRate = 0.013;
            } else if (toCurrency.equals("CAD")) {
                conversionRate = 0.012;
            } else if (toCurrency.equals("INR")) {
                conversionRate = 0.59;
            }
        } else if (fromCurrency.equals("AUD")) {
            if (toCurrency.equals("USD")) {
                conversionRate = 0.69;
            } else if (toCurrency.equals("EUR")) {
                conversionRate = 0.61;
            } else if (toCurrency.equals("GBP")) {
                conversionRate = 0.54;
            } else if (toCurrency.equals("JPY")) {
                conversionRate = 77.83;
            } else if (toCurrency.equals("CAD")) {
                conversionRate = 0.92;
            }
        } else if (fromCurrency.equals("CAD")) {
            if (toCurrency.equals("USD")) {
                conversionRate = 0.75;
            } else if (toCurrency.equals("EUR")) {
                conversionRate = 0.66;
            } else if (toCurrency.equals("GBP")) {
                conversionRate = 0.58;
            } else if (toCurrency.equals("JPY")) {
                conversionRate = 82.24;
            } else if (toCurrency.equals("AUD")) {
                conversionRate = 1.09;
            } else if (toCurrency.equals("INR")) {
                conversionRate = 60.62;
            }
        } else if (fromCurrency.equals("INR")) {
            if (toCurrency.equals("USD")) {
                conversionRate = 0.0121;
            } else if (toCurrency.equals("EUR")) { 
                conversionRate = 0.01113;
            } else if (toCurrency.equals("GBP")) {
                conversionRate = 0.0098;
            } else if (toCurrency.equals("JPY")) {
                conversionRate = 1.169;
            } else if (toCurrency.equals("AUD")) {
                conversionRate = 0.0187;
            } else if (toCurrency.equals("CAD")) {
                conversionRate = 0.0165;
            }
        }

        return amount * conversionRate;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverterUI();
            }
        });
    }
}
