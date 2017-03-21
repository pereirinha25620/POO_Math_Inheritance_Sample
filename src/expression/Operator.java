package expression;

public abstract class Operator extends Expression {

    protected Expression left, right;
    protected char operator;


    public Operator(Expression left, Expression right, char operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public String toString() {
        String operationToString = left.toString() + " " + operator + " " + right.toString();

        if (operator == '+' || operator == '-')
            return "( " + operationToString + " )";

        return operationToString;
    }
}
