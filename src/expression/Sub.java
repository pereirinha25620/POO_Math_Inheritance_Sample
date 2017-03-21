package expression;

public class Sub extends Operator {


    public Sub(Expression left, Expression right) {
        super(left, right, '-');
    }

    @Override
    public double eval() {
        return left.eval() - right.eval();
    }


}
