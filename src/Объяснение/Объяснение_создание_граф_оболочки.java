package Объяснение;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Объяснение_создание_граф_оболочки {
    public static void main(String[] args) {
        //создаем панель
        JPanel windowContent = new JPanel();

        //Задаем менеджер для нашей панели
        FlowLayout f1 = new FlowLayout();
        windowContent.setLayout(f1);

        //создаем компоненты в памяти
        JLabel label1 = new JLabel("Number 1:"); //ввод первой цифры
        JTextField field1 = new JTextField(10); //создаем текстовое поле, куда будем вводить цифру
        JLabel label2 = new JLabel("Number 2:");  //ввод второй цифры
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum: ");
        JTextField result = new JTextField(10);
        JButton go = new JButton("Add"); //создаем кнопку

        //Добавляем эти компоненты в нашу панель
        windowContent.add(label1);
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(go);
        windowContent.add(result);

        //Создаем само окно(фрейм) и задаем для фрейма нашу панель
        JFrame frame = new JFrame("Мой аху@вший калькулятор!");
        frame.setContentPane(windowContent);

        //задаем размеры, делаем фрейм видимым
        frame.setSize(400,100);  //размер
        frame.setVisible(true);  //видимость



    }

}

//Кусочек кода
//public void actionPerformed(ActionEvent e) {
//    JButton clickedButton = (JButton)e.getSource();
//    String clickedButtonLibel = clickedButton.getText(); //Получаем надпись на кнопки
//
//
//    //Что бы вывести определенное сообщение при нажатии определенной клавиши прописываем следующие:
//    JOptionPane.showConfirmDialog(null,"You pressed " + clickedButtonLibel,
//            "test",JOptionPane.PLAIN_MESSAGE);
//    //PLAIN_MESSAGE - отображение клавиши "Окей"
//
//    //Нам нужно зарегистрировать компонент с нашим actionPerformed - регистрация проходит в нашем главном методе
//    //Calculator
//}

    //Создадим схему для размещения элементов на нашем графическом калькуляторе
//    BorderLayout b1 = new BorderLayout();
//       windowContent.setLayout(b1);
//
//               //создадим отображения нашего поля и добавим его на северную область окна
//               displayField = new JTextField(30);
//               windowContent.add("North",displayField);
//
//               //Создадим кнопки с помощью конструктора JButton, он принимает текст в качестве параметра:
//               button0 = new JButton("0");
//               button1 = new JButton("1");
//               button2 = new JButton("2");
//               button3 = new JButton("3");
//               button4 = new JButton("4");
//               button5 = new JButton("5");
//               button6 = new JButton("6");
//               button7 = new JButton("7");
//               button8 = new JButton("8");
//               button9 = new JButton("9");
//               buttonPoint = new JButton(".");
//               buttonEqual = new JButton("=");
//
//               //Создаем панель GridLayout, в который будут все кнопки
//               p1 = new JPanel();
//               GridLayout g1 = new GridLayout(4,3);
//               p1.setLayout(g1);
//
//               //Добавляем сами кнопки
//               p1.add(button1);
//               p1.add(button2);
//               p1.add(button3);
//               p1.add(button4);
//               p1.add(button5);
//               p1.add(button6);
//               p1.add(button7);
//               p1.add(button8);
//               p1.add(button9);
//               p1.add(button0);
//               p1.add(buttonPoint);
//               p1.add(buttonEqual);
//
//               //Помещаем панель в центральную область окна
//               windowContent.add("Center",p1);
//
//               //Создаем сам фрейм, который будет отображать наши графические элементы
//               JFrame frame = new JFrame("Мой ахуевший калькулятор!");
//               frame.setContentPane(windowContent);
//
//               frame.pack(); //Создаем размер окна
//               frame.setVisible(true); //отображаем окно
//
//               //Регистрируем  компонент с нашим actionPerformed
//               Engine calculatorEngine = new Engine(this);
//               button0.addActionListener(calculatorEngine);
//               button1.addActionListener(calculatorEngine);
//               button2.addActionListener(calculatorEngine);
//               button3.addActionListener(calculatorEngine);
//               button4.addActionListener(calculatorEngine);
//               button5.addActionListener(calculatorEngine);
//               button6.addActionListener(calculatorEngine);
//               button7.addActionListener(calculatorEngine);
//               button8.addActionListener(calculatorEngine);
//               button9.addActionListener(calculatorEngine);
//               buttonPoint.addActionListener(calculatorEngine);
//               buttonEqual.addActionListener(calculatorEngine);
//
