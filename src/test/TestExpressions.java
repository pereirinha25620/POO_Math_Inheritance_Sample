package test;

import expression.*;

public class TestExpressions {

    public static void main(String[] args) {

        Expression const1 = new Const(10);

        Expression adder1 = new Sub(new Const(4), new Const(2));
        Expression adder2 = new Add(const1, adder1);

        System.out.println(adder2.toString());
        System.out.println(adder2.eval());

        Expression div1 = new Div(new Const(4), new Const(2));
        Expression mult1 = new Mult(adder2, div1);

        System.out.println(mult1.toString());
        System.out.println(mult1.eval());


    }
}
