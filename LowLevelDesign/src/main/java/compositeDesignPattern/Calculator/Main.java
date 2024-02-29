package compositeDesignPattern.Calculator;

/**
 * @author We will calulate 2 * ( 4 + 3 )
 *              *
 *            /   \
 *         2       +
 *               /   \
 *             4      3
 */
public class Main {

    public static void main(String[] args) {

        Number two = new Number(2);
        Number four = new Number(4);
        Number three = new Number(3);

        ArithmeticExpression arithmeticExpression = new Expression(four,three,Operation.ADD);
        ArithmeticExpression finalExpression = new Expression(two, arithmeticExpression,Operation.MULTIPLY);

        System.out.println("Final value is " + finalExpression.evaluate());
    }
}
