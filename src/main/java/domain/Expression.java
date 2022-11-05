package domain;

public class Expression {
    private static final String EXPRESSION_SPLITTER = " ";
    private String[] expression;

    public Expression(String input) {
        expression = input.split(EXPRESSION_SPLITTER);
    }

    public String[] getExpression() {
        return expression;
    }
}
