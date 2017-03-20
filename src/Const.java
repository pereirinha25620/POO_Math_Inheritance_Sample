
public class Const extends Expression {

    private double value;

    // Constructor
    public Const(double value) {
        this.value = value;
    }


    // Inherited methods to implement from Expression
    public double eval() {
        return value;
    }

    public String toString() {
        return "" + value;
    }

}
