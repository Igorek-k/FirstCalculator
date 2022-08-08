package FirstCalculator;

import javax.swing.*;
import java.awt.*;

public class Calculator {

    //Объявляем все компоненты нашего калькулятора

    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonPoint = new JButton(".");
    JButton buttonEqual = new JButton("=");
    JButton buttonC = new JButton("С");

    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonDivide = new JButton("/");
    JButton buttonMultuplay = new JButton("*");

    JPanel windowContent = new JPanel();
    JTextField displayField = new JTextField(30);

    //Создаем конструктор, в нем создаем все компоненты и добавляем в наш фрейм
    public Calculator() {
        BorderLayout b1 = new BorderLayout();
        windowContent.setLayout(b1);

        windowContent.add("North", displayField);

        JPanel p1 = new JPanel();
        GridLayout g1 = new GridLayout(4, 3);

        p1.setLayout(g1);
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(button0);
        p1.add(buttonPoint);
        p1.add(buttonEqual);


        windowContent.add("Center", p1);


        JPanel p2 = new JPanel();
        GridLayout g2 = new GridLayout(5, 1); // 5 элементов в 1 строку

        p2.setLayout(g2);
        p2.add(buttonC);
        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonDivide);
        p2.add(buttonMultuplay);


        windowContent.add("East", p2);

        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);

        frame.pack();
        frame.setVisible(true);

        Engine calculatorEngine = new Engine(this);
        button0.addActionListener(calculatorEngine);
        button1.addActionListener(calculatorEngine);
        button2.addActionListener(calculatorEngine);
        button3.addActionListener(calculatorEngine);
        button4.addActionListener(calculatorEngine);
        button5.addActionListener(calculatorEngine);
        button6.addActionListener(calculatorEngine);
        button7.addActionListener(calculatorEngine);
        button8.addActionListener(calculatorEngine);
        button9.addActionListener(calculatorEngine);

        buttonPoint.addActionListener(calculatorEngine);
        buttonEqual.addActionListener(calculatorEngine);

        buttonC.addActionListener(calculatorEngine);
        buttonPlus.addActionListener(calculatorEngine);
        buttonMinus.addActionListener(calculatorEngine);
        buttonDivide.addActionListener(calculatorEngine);
        buttonMultuplay.addActionListener(calculatorEngine);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
}
