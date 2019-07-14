package state.robot;

public class StartState implements State {

    private Robot robot;

    public StartState(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void startRobot() {
        System.out.println("启动机器人，进入Movement模式");
        robot.setSpeed(1);
        robot.setState(robot.getMovementState());
        robot.changeDir();
    }

    @Override
    public void stopRobot() {
        System.out.println("机器人还未启动，不能关闭");
    }

    @Override
    public void downShift() {
        System.out.println("机器人还未启动，不能降档");
    }

    @Override
    public void upShift() {
        System.out.println("机器人还未启动，不能升档");
    }

    @Override
    public void changeDir() {
        System.out.println("机器人还未启动");
    }
}
