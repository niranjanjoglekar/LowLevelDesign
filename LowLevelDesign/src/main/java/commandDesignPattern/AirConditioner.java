package commandDesignPattern;

/**
 * This is receiver
 */
public class AirConditioner {

    boolean isOn;
    int temperture;

    public void turnOnAC(){
        isOn = true;
        System.out.println("AC is ON !!!");
    }

    public void turnOffAC(){
        isOn = false;
        System.out.println("AC is OFF !!!");
    }

    public void setTemperture(int temperature){
        this.temperture = temperature;
        System.out.println("Setting temperature to : "+temperature);
    }
}
