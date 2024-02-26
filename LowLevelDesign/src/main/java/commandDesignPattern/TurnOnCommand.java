package commandDesignPattern;

/**
 * This is Turn-On Command implementation
 */
public class TurnOnCommand implements ICommand {

    AirConditioner airConditioner;

    TurnOnCommand(AirConditioner airConditioner) { this.airConditioner = airConditioner; }

    @Override
    public void execute() {
        airConditioner.turnOnAC();
    }

    @Override
    public void undo() {
        airConditioner.turnOffAC();
    }
}
