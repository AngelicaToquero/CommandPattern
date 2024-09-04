import java.util.HashMap;
import java.util.Map;

public class SmartHomeController {
    private Map<String, Command> commandMap = new HashMap<>();

    public void setCommand(String commandName, Command command) {
        commandMap.put(commandName, command);
    }

    public void executeCommand(String commandName) {
        Command command = commandMap.get(commandName);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("Command not found!");
        }
    }
}
