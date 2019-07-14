package command;

import java.util.HashMap;
import java.util.Map;

public class ControlPanel {

    private Map<String, Command> commands = new HashMap<>();

    public void addCommand(String name, Command command) {
        commands.put(name, command);
    }

    public Command findCommand(String name) {
        return commands.get(name);
    }

    public void removeCommand(String name) {
        commands.remove(name);
    }

}
