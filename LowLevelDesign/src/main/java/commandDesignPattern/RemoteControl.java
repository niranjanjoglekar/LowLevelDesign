package commandDesignPattern;

import java.util.Stack;

/**
 * This is invoker
 */
public class RemoteControl {
    Stack<ICommand> commandHistory = new Stack<>();
    ICommand command;

    RemoteControl(){}

    public void setCommand(ICommand command) { this.command = command; }

    public void pressButton() {
        command.execute();
        commandHistory.push(command);
    }

    public void undo(){
        if(!commandHistory.isEmpty()){
            ICommand lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
    }
}
