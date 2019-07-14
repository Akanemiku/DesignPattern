package factory;

public class BMWX6 implements Car {
    @Override
    public void startUp() {
        System.out.println("BMWX6 Start Up");
    }

    @Override
    public void run() {
        System.out.println("BMWX6 Run");
    }
}
