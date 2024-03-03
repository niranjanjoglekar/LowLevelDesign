package FactoryDesignPattern;

/**
 * @author niranjanjoglekar on 03/03/24
 */
public class VehicleFactory {

    public static Vehicle getVehicle(String type, int capacity, String name){

        switch (type){
            case "Bike":
                return new Bike(name,capacity);
            case "Car":
                return new Car(name,capacity);
            default:
                return new NullVehicle();
        }
    }
}
