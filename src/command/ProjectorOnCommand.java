package command;

public class ProjectorOnCommand implements Command {
    private Projector projector;

    public ProjectorOnCommand(Projector projector) {
        this.projector = projector;
    }

    @Override
    public void execute() {
        projector.ProjectorOn();
    }
}
