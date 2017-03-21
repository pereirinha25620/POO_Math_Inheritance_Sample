
public class Div extends Operator {

    public Div(IExpression left, IExpression right) {
        super(left, right, '/');
    }

    @Override
    public double eval() {
        return left.eval() / right.eval();
    }
}
