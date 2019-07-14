package state.robot;

public class MovementState implements State {

    private Robot robot;

    public MovementState(Robot robot) {
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
        System.out.println("机器人未进入前进模式，不能降档");
    }

    @Override
    public void upShift() {
        System.out.println("机器人未进入前进模式，不能降档");
    }

    @Override
    public void changeDir() {
        if (robot.getSpeed() > 0) {
            System.out.print("机器人进入前进模式：");
            System.out.println("soundAlarm");
            robot.setState(robot.getForwardState());
            robot.downShift();
        } else {
            System.out.println("机器人进入后退模式");
            robot.setState(robot.getReverseState());
        }
    }
}
