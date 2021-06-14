package OOP4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcButtonActionListener implements ActionListener {

    private final JTextField textField;

    public CalcButtonActionListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String inputField = textField.getText();
        String[] plus = inputField.split("\\+");
        String[] subtract = inputField.split("-");
        String[] multiply = inputField.split("\\*");
        String[] div = inputField.split("/");
        String[] math = inputField.split("√");

        if (plus.length >= 2) {
            int sum = 0;
            for (int i = 0; i < plus.length; i++) {
                sum += Integer.parseInt(plus[i]);
            }

            textField.setText(String.valueOf(sum));
        } else if (subtract.length >= 2) {
            int sub = Integer.parseInt(subtract[0]);
            for (int i = 1; i < subtract.length; i++) {
                sub -= Integer.parseInt(subtract[i]);

            }
            textField.setText(String.valueOf(sub));
        } else if (multiply.length >= 2) {
            int mul = Integer.parseInt(multiply[0]);
            for (int i = 1; i < multiply.length; i++) {
                mul *= Integer.parseInt(multiply[i]);

            }
            textField.setText(String.valueOf(mul));

        } else if (div.length >= 2) {
            int diving = Integer.parseInt(div[0]);
            for (int i = 1; i < div.length; i++) {
                diving /= Integer.parseInt(div[i]);

            }
            textField.setText(String.valueOf(diving));
        }
        else if (math.length >= 0) {
            double mat = Math.sqrt(Integer.parseInt(math[1]));
            textField.setText(String.valueOf(mat));
            }

        }

}
