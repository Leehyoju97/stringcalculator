package domain;

import java.util.regex.Pattern;

public class Calculator {

    private static final Pattern regExp = Pattern.compile("^[0-9]*$");
    private Expression expression;

    public Calculator(Expression expression) {
        this.expression = expression;
    }

    public int calculate() {
        int result = 0;
        Operator currentOperator = Operator.PLUS;

        for (String input : expression.getExpression()) {
            if (regExp.matcher(input).find()) {
                result = currentOperator.operate(result, Integer.parseInt(input));

                continue;
            }

            currentOperator = Operator.findOperate(input);
        }

        return result;
    }
}
