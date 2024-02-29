package NullObjectDesignPattern;

/**
 * @author niranjanjoglekar on 29/02/24
 */
public class VehicleFactory {

    static Vehicle getVehicle(String type){
        if(type.equalsIgnoreCase("car")){
            return new Car();
        }
        return new NullVehicle();
    }
}
