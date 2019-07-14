package command;

public class ProjectorOffCommand implements Command {
    private Projector projector;

    public ProjectorOffCommand(Projector projector) {
        this.projector = projector;
    }

    @Override
    public void execute() {
        projector.ProjectorOff();
    }
}
