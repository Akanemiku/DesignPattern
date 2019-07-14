package factory;

public class AudiA8 implements Car {
    @Override
    public void startUp() {
        System.out.println("AudiA8 Start Up");
    }

    @Override
    public void run() {
        System.out.println("AudiA8 Run");
    }
}
