package HW_5;

import HW_5.model.CalculatorModel;
import HW_5.view.CalculatorView;
import HW_5.presenter.CalculatorPresenter;

public class Main {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorPresenter presenter = new CalculatorPresenter(model, view);
    }
}
