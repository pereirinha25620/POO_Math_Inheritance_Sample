public class Mult extends Operator {

    public Mult(IExpression left, IExpression right) {
        super(left, right, '*');
    }

    @Override
    public double eval() {
        return left.eval() * right.eval();
    }
}
