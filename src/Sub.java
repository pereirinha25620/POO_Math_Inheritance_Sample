
public class Sub extends Operator {


    public Sub(IExpression left, IExpression right) {
        super(left, right, '-');
    }

    @Override
    public double eval() {
        return left.eval() - right.eval();
    }


}
