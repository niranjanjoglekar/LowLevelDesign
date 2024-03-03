package FactoryDesignPattern;

/**
 * @author niranjanjoglekar on 03/03/24
 */

public class Client {
    public static void main(String[] args) {
        Vehicle hondaCar = VehicleFactory.getVehicle("Car", 4, "HondaCity");
        System.out.println("Vehicle Name : " + hondaCar.getDescription());
        System.out.println("Seating capacity : " + hondaCar.getSeatingCapacity());

        Vehicle cycle = VehicleFactory.getVehicle("Bike",2,"Bicycle");
        System.out.println("Vehicle Name : "+cycle.getDescription());
        System.out.println("Seating capacity : " + cycle.getSeatingCapacity());

        Vehicle bus = VehicleFactory.getVehicle("Bus",2,"Bus");
        System.out.println("Vehicle Name : "+bus.getDescription());
        System.out.println("Seating capacity : " + bus.getSeatingCapacity());
    }
}

