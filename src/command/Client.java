package command;

public class Client {
    public static void main(String[] args) {
        ControlPanel controlPanel = new ControlPanel();

        Projector pj1 = new Projector();
        Command command1 = new ProjectorOnCommand(pj1);
        Command command2 = new ProjectorOffCommand(pj1);

        controlPanel.addCommand("projectorOn", command1);
        controlPanel.addCommand("projectorOff", command2);

        Command command = controlPanel.findCommand("projectorOn");
        command.execute();
    }
}
