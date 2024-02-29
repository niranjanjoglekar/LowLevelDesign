package NullObjectDesignPattern;

/**
 * @author niranjanjoglekar on 29/02/24
 */
public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("Car");
        printVehicle(vehicle);
    }

    static void printVehicle(Vehicle vehicle){
        System.out.println("Tank Capacity : "+vehicle.getTankCapacity());
        System.out.println("Seating capacity : "+vehicle.getSeatingCapacity());
    }
}
