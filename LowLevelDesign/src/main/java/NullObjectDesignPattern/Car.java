package NullObjectDesignPattern;

/**
 * @author niranjanjoglekar on 29/02/24
 */
public class Car implements Vehicle{
    @Override
    public int getTankCapacity() {
        return 35;
    }

    @Override
    public int getSeatingCapacity() {
        return 4;
    }
}
