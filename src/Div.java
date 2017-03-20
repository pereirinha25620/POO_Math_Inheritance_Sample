
public class Div extends Operator {

    public Div(Expression left, Expression right) {
        super(left, right, '/');
    }

    @Override
    public double eval() {
        return left.eval() / right.eval();
    }
}
