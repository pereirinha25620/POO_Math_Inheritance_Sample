package expression;

public class Mult extends Operator {

    public Mult(Expression left, Expression right) {
        super(left, right, '*');
    }

    @Override
    public double eval() {
        return left.eval() * right.eval();
    }
}
