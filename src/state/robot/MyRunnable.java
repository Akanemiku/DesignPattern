package state.robot;

public class MyRunnable implements Runnable {

    private String StartRobot = "blinkLights";
    private String FirstGear = "Flash Lights";

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("startRobot")) {
            System.out.println(StartRobot);
        } else if (Thread.currentThread().getName().equals("firstGear")) {
            System.out.println(FirstGear);
        }

    }
}
