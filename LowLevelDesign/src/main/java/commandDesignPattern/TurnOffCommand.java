package commandDesignPattern;

/**
 * This is Turn-Off command
 */
public class TurnOffCommand implements ICommand{

    AirConditioner airConditioner;

    TurnOffCommand(AirConditioner airConditioner) { this.airConditioner = airConditioner; }

    @Override
    public void execute() {
        airConditioner.turnOffAC();
    }

    @Override
    public void undo() {
        airConditioner.turnOnAC();
    }
}
