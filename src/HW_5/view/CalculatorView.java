package HW_5.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    private JTextField num1Field;
    private JTextField num2Field;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JTextField resultField;

    public CalculatorView() {
        // Создание компонентов GUI
        num1Field = new JTextField();
        num2Field = new JTextField();
        addButton = new JButton("Add");
        subtractButton = new JButton("Subtract");
        multiplyButton = new JButton("Multiply");
        divideButton = new JButton("Divide");
        resultField = new JTextField();

        num1Field.setColumns(4);
        num2Field.setColumns(4);
        resultField.setColumns(4);

        Font textFieldFont = new Font("Arial", Font.PLAIN, 16);
        num1Field.setFont(textFieldFont);
        num2Field.setFont(textFieldFont);
        resultField.setFont(textFieldFont);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = num1 + num2;
                resultField.setText(String.valueOf(result));
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = num1 - num2;
                resultField.setText(String.valueOf(result));
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = num1 * num2;
                resultField.setText(String.valueOf(result));
            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                try {
                    double result = num1 / num2;
                    resultField.setText(String.valueOf(result));
                } catch (ArithmeticException ex) {
                    resultField.setText("Error: Division by zero");
                }
            }
        });

        // Установка компонентов на панель или фрейм
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Number 1: "));
        inputPanel.add(num1Field);
        inputPanel.add(new JLabel("Number 2: "));
        inputPanel.add(num2Field);

        panel.add(inputPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);

        panel.add(buttonPanel, BorderLayout.CENTER);

        JPanel resultPanel = new JPanel();
        resultPanel.add(new JLabel("Result: "));
        resultPanel.add(resultField);

        panel.add(resultPanel, BorderLayout.SOUTH);

        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    // Принцип единственной ответственности (Single Responsibility Principle, SRP)
    // Класс представления отвечает только за отображение GUI и обработку действий пользователя.
    // Он не содержит бизнес-логики и не зависит от презентера напрямую.

    public double getNum1() {
        return Double.parseDouble(num1Field.getText());
    }

    public double getNum2() {
        return Double.parseDouble(num2Field.getText());
    }

    public void setResult(double result) {
        resultField.setText(String.valueOf(result));
    }

    public void displayErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public class AddButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = num1 + num2;
            resultField.setText(String.valueOf(result));
        }
    }

    public class SubtractButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = num1 - num2;
            resultField.setText(String.valueOf(result));
        }
    }

    public class MultiplyButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = num1 * num2;
            resultField.setText(String.valueOf(result));
        }
    }

    public class DivideButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            try {
                double result = num1 / num2;
                resultField.setText(String.valueOf(result));
            } catch (ArithmeticException ex) {
                resultField.setText("Error: Division by zero");
            }
        }
    }

    // Принцип открытости/закрытости (Open/Closed Principle, OCP)
    // Класс представления предоставляет методы для добавления слушателей для каждой операции.
    // Это позволяет добавлять новые операции без изменения кода представления.

    public void addCalculateListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }

    public void subtractCalculateListener(ActionListener listener) {
        subtractButton.addActionListener(listener);
    }

    public void multiplyCalculateListener(ActionListener listener) {
        multiplyButton.addActionListener(listener);
    }

    public void divideCalculateListener(ActionListener listener) {
        divideButton.addActionListener(listener);
    }
}
