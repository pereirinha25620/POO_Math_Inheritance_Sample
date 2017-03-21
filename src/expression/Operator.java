package expression;

public abstract class Operator implements IExpression {

    protected IExpression left, right;
    protected char operator;


    public Operator(IExpression left, IExpression right, char operator) {
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
