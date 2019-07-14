package state.robot;

public class Robot {

    private final State startState;
    private final State stopState;
    private final State reverseState;
    private final State forwardState;
    private final State firstGearState;
    private final State secondGearState;
    private final State movementState;

    private int speed;

    private State state;

    public Robot() {
        startState = new StartState(this);
        stopState = new StopState(this);
        reverseState = new ReverseState(this);
        forwardState = new ForwardState(this);
        firstGearState = new FirstGearState(this);
        secondGearState = new SecondGearState(this);
        movementState = new MovementState(this);

        state = startState;
        speed = 0;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void startRobot() {
        this.state.startRobot();
    }

    public void stopRobot() {
        this.state.stopRobot();
    }

    public void downShift() {
        this.state.downShift();
    }

    public void upShift() {
        this.state.upShift();
    }

    public void changeDir() {
        this.state.changeDir();
    }

    public State getStartState() {
        return startState;
    }

    public State getStopState() {
        return stopState;
    }

    public State getReverseState() {
        return reverseState;
    }

    public State getFirstGearState() {
        return firstGearState;
    }

    public State getSecondGearState() {
        return secondGearState;
    }

    public State getForwardState() {
        return forwardState;
    }

    public State getMovementState() {
        return movementState;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
