package state.robot;

public class StopState implements State {

    private Robot robot;

    public StopState(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void startRobot() {
        System.out.println("机器人已启动，未关闭情况下不能再次启动");
    }

    @Override
    public void stopRobot() {
        System.out.println("机器人已被关闭");
    }

    @Override
    public void downShift() {
        System.out.println("机器人即将关闭，不能降档");
    }

    @Override
    public void upShift() {
        System.out.println("机器人即将关闭，不能升档");
    }

    @Override
    public void changeDir() {
        System.out.println("机器人即将关闭，不能换档");
    }

}
