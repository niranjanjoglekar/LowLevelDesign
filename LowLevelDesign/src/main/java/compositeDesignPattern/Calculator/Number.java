package compositeDesignPattern.Calculator;

/**
 * @author niranjanjoglekar on 29/02/24
 */
public class Number implements ArithmeticExpression{

    int value;

    public Number(int value){
        this.value = value;
    }

    @Override
    public int evaluate() {
        System.out.println("Number value is "+ value);
        return value;
    }
}
