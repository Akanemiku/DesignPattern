import state.robot.MyRunnable;
import state.robot.Robot;

public class Client {
    public static void main(String[] args) {

        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable, "startRobot");
        Thread thread1 = new Thread(runnable, "firstGear");

        Robot robot = new Robot();
        robot.startRobot();
        thread.start();

        System.out.println();
        //System.out.println(robot.getSpeed());
        robot.downShift();
        thread1.start();
        robot.upShift();
        robot.downShift();

        System.out.println();
        robot.changeDir();
        robot.stopRobot();
    }
}
