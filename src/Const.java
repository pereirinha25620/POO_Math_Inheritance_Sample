
public class Const implements IExpression {

    private double value;

    // Constructor
    public Const(double value) {
        this.value = value;
    }

    public double eval() {
        return value;
    }

    public String toString() {
        return "" + value;
    }

}
