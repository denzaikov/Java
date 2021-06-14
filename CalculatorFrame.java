package OOP4;

import javax.swing.*;
import java.awt.*;


public class CalculatorFrame extends JFrame {

    private JTextField inputArea;
    public CalculatorFrame(){

        setTitle("Калькулятор");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setBounds(100, 100, 500, 500);
        setVisible(true);
        setJMenuBar(createMenuBar());
        setLayout(new BorderLayout());

        add(createTopPanel(), BorderLayout.NORTH);
        add(createBottomPanel(), BorderLayout.CENTER);

        }

    private JMenuBar createMenuBar() {

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        JMenuItem openItem = new JMenu("open");
        fileMenu.add(openItem);

        JMenuItem exitItem = new JMenu("exit");
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);

        return menuBar;

    }
    private JPanel createTopPanel(){

        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        inputArea = new JTextField();
        inputArea.setEditable(false);
        top.add(inputArea, BorderLayout.CENTER);

        return top;
    }
    private JPanel createBottomPanel(){

        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout());
        bottom.setLayout(new GridLayout(4,5));

        DigitButtonActionListener digitButtonActionListener = new DigitButtonActionListener(inputArea);

        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton(String.valueOf(i));
            bottom.add(btn);
            btn.addActionListener(digitButtonActionListener);
        }

        JButton plus = new JButton("+");
        bottom.add(plus);
        plus.addActionListener(e -> inputArea.setText(inputArea.getText() + "+"));

        JButton subtract = new JButton("-");
        bottom.add(subtract);
        subtract.addActionListener(e -> inputArea.setText(inputArea.getText() + "-"));

        JButton multiply = new JButton("*");
        bottom.add(multiply);
        multiply.addActionListener(e -> inputArea.setText(inputArea.getText() + "*"));

        JButton div = new JButton("/");
        bottom.add(div);
        div.addActionListener(e -> inputArea.setText(inputArea.getText() + "/"));

        JButton math = new JButton("√");
        bottom.add(math);
        math.addActionListener(e -> inputArea.setText(inputArea.getText() + "√"));

        JButton calc = new JButton("=");
        bottom.add(calc);
        calc.addActionListener(new CalcButtonActionListener(inputArea));

        JButton clear = new JButton("Очистить");
        bottom.add(clear);
        clear.addActionListener(e -> inputArea.setText(""));

        return bottom;
    }
}
