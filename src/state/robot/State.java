package state.robot;

public interface State {
    void startRobot();

    void stopRobot();

    void downShift();

    void upShift();

    void changeDir();
}
