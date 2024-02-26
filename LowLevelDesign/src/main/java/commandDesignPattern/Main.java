package commandDesignPattern;

public class Main {

    public static void main(String[] args) {
        //Receiver Object : AirConditioner
        AirConditioner airConditioner = new AirConditioner();

        //Invoker object : RemoteControl
        RemoteControl remoteControl = new RemoteControl();

        // Creating command and pressing button
        remoteControl.setCommand(new TurnOnCommand(airConditioner));
        remoteControl.pressButton();

        // Again set command
        remoteControl.setCommand(new TurnOffCommand(airConditioner));
        remoteControl.pressButton();

        // Undo lat operation
        remoteControl.undo();
    }

}
