import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyExchangeApp extends Frame {
    private TextField inputField;
    private Label resultLabel;

    public CurrencyExchangeApp() {
        setTitle("Currency Exchange");
        setLayout(new FlowLayout());

        Label inputLabel = new Label("Enter amount in USD:");
        inputField = new TextField(10);
        Button convertButton = new Button("Convert");
        resultLabel = new Label();

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = inputField.getText();
                double usdAmount = Double.parseDouble(inputText);
                double exchangeRate = 4000; // Example: 1 USD = 0.85 EUR
                double eurAmount = usdAmount * exchangeRate;
                inputField = new TextField(10);
                resultLabel.setText("Equivalent amount in Khmer: " + eurAmount);
            }
        });

        add(inputLabel);
        add(inputField);
        add(convertButton);
        add(resultLabel);

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        CurrencyExchangeApp app = new CurrencyExchangeApp();
    }
}