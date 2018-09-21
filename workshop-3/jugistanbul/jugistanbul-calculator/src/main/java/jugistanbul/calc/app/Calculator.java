package jugistanbul.calc.app;

import jugistanbul.calc.minus.MinusOperation;
import jugistanbul.calc.multiply.MultiplyOperation;

/**
 * @author Taner Diler (taner.diler@gmail.com)
 */
public class Calculator {
    public static void main(String[] args) {
        Number minusResult = new MinusOperation(10, -5, 2, 20).calc();
        System.out.println("Minus Operation : 10-(-5)-2-20 => "+minusResult);


        Number multiplyResult = new MultiplyOperation(10,-5, 2,20).calc();
        System.out.println("Multiply Operation : 10*(-5)*2*20 => "+multiplyResult);
    }
}
