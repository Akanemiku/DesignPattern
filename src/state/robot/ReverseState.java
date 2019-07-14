package state.robot;

public class ReverseState implements State {

    private Robot robot;

    public ReverseState(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void startRobot() {
        System.out.println("机器人已启动，未关闭情况下不能再次启动");
    }

    @Override
    public void stopRobot() {
        System.out.println("即将关闭机器人，进入停止模式");
        robot.setState(robot.getStopState());
        robot.stopRobot();
    }

    @Override
    public void downShift() {
        System.out.println("现在是后退模式，不能降档");
    }

    @Override
    public void upShift() {
        System.out.println("现在是后退模式，不能升档");
    }

    @Override
    public void changeDir() {
        robot.setSpeed(0);
        System.out.println("机器人进入前进模式");
        robot.setState(robot.getForwardState());
    }

}
