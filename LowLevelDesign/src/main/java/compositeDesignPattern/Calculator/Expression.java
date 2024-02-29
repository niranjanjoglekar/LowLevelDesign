package compositeDesignPattern.Calculator;

/**
 * @author niranjanjoglekar on 29/02/24
 */
public class Expression implements ArithmeticExpression{

    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operation operation;

    public Expression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression, Operation operation){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        int value = 0;
        switch (operation){
            case ADD:
                value = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case SUBRACT:
                value = leftExpression.evaluate() - rightExpression.evaluate();
                break;
            case MULTIPLY:
                value = leftExpression.evaluate() * rightExpression.evaluate();
                break;
            case DIVIDE:
                value = leftExpression.evaluate() / rightExpression.evaluate();
                break;
            default:
                break;
        }
        System.out.println("Expression value is "+value);
        return value;
    }
}
