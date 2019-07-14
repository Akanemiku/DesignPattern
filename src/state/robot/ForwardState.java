package state.robot;

public class ForwardState implements State {

    private Robot robot;

    public ForwardState(Robot robot) {
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
        System.out.println("机器人进入一档");
        System.out.println("显示屏显示：1");
        robot.setState(robot.getFirstGearState());
    }

    @Override
    public void upShift() {
        System.out.println("机器人进入二档");
        System.out.println("2");
        robot.setState(robot.getSecondGearState());
    }

    @Override
    public void changeDir() {
        robot.setSpeed(0);
        System.out.print("机器人进入后退模式：");
        System.out.println("Sound Warning Beep");
        System.out.println("显示器显示：R");
        robot.setState(robot.getReverseState());
    }
}
