package expression;

public class Add extends Operator {


    public Add(IExpression left, IExpression right) {
        super(left, right, '+');
    }


    @Override
    public double eval() {
        return left.eval() + right.eval();
    }

}
