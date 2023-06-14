package HW_5.presenter;

import HW_5.model.CalculatorModel;
import HW_5.view.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        view.addCalculateListener(new AddButtonListener()); // Используется принцип DIP - зависимость от абстракции
        view.subtractCalculateListener(new SubtractButtonListener()); // Используется принцип DIP - зависимость от абстракции
        view.multiplyCalculateListener(new MultiplyButtonListener()); // Используется принцип DIP - зависимость от абстракции
        view.divideCalculateListener(new DivideButtonListener()); // Используется принцип DIP - зависимость от абстракции
    }

    class AddButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double num1 = view.getNum1();
            double num2 = view.getNum2();
            double result = model.add(num1, num2); // Используется принцип SRP - класс отвечает только за координацию
            view.setResult(result);
        }
    }

    class SubtractButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double num1 = view.getNum1();
            double num2 = view.getNum2();
            double result = model.subtract(num1, num2); // Используется принцип SRP - класс отвечает только за координацию
            view.setResult(result);
        }
    }

    class MultiplyButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double num1 = view.getNum1();
            double num2 = view.getNum2();
            double result = model.multiply(num1, num2); // Используется принцип SRP - класс отвечает только за координацию
            view.setResult(result);
        }
    }

    class DivideButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double num1 = view.getNum1();
            double num2 = view.getNum2();
            try {
                double result = model.divide(num1, num2); // Используется принцип SRP - класс отвечает только за координацию
                view.setResult(result);
            } catch (ArithmeticException ex) {
                view.displayErrorMessage("Error: Division by zero");
            }
        }
    }
}
