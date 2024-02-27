package decorator;

/**
 * This is decorator
 */
public class Mushroom extends ToppingDecorator{

    BasePizza basePizza;

    Mushroom(BasePizza basePizza) { this.basePizza = basePizza;}

    @Override
    int cost() {
        return this.basePizza.cost() + 30;
    }
}
