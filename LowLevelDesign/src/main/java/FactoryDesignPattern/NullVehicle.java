package FactoryDesignPattern;

import compositeDesignPattern.Calculator.Number;

/**
 * @author niranjanjoglekar on 03/03/24
 */
public class NullVehicle extends Vehicle{
    NullVehicle(){
        this.name = "Invalid vehicle Type";
        this.seatingCapacity = 0;
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
