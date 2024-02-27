package decorator;

/**
 * This is decorator
 */
public class Jalapeno extends ToppingDecorator{
    BasePizza basePizza;

    Jalapeno(BasePizza basePizza) { this.basePizza = basePizza;}

    @Override
    int cost() {
        return this.basePizza.cost() + 20;
    }
}
