package NullObjectDesignPattern;

/**
 * @author niranjanjoglekar on 29/02/24
 */
public class NullVehicle implements Vehicle{

    @Override
    public int getTankCapacity() { return 0; }

    @Override
    public int getSeatingCapacity() { return 0; }
}
