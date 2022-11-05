import domain.Calculator;
import domain.Expression;
import view.InputView;
import view.OutputView;

public class MainApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new Expression(InputView.showInputMessage()));
        OutputView.showOutputMessage(calculator.calculate());
    }
}
