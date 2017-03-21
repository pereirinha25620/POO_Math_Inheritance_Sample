package expression;

public class Add extends Operator {


    public Add(Expression left, Expression right) {
        super(left, right, '+');
    }


    @Override
    public double eval() {
        return left.eval() + right.eval();
    }

}
