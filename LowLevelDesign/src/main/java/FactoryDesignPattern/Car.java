package FactoryDesignPattern;

/**
 * @author niranjanjoglekar on 03/03/24
 */
public class Car extends Vehicle{

    Car(){}

    Car(String name, int seatingCapacity){
        this.name = name;
        this.seatingCapacity = seatingCapacity;
    }
    @Override
    int getSeatingCapacity() {
        return this.seatingCapacity;
    }

    @Override
    String getDescription() {
        return this.name;
    }
}
