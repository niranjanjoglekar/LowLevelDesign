package FactoryDesignPattern;

/**
 * @author niranjanjoglekar on 03/03/24
 */
public abstract class Vehicle {
    String name;
    int seatingCapacity;
    abstract int getSeatingCapacity();
    abstract String getDescription();
}
