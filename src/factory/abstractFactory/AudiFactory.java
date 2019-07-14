package factory.abstractFactory;

import factory.AudiA8;
import factory.Car;

public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new AudiA8();
    }

    @Override
    public CarFrame createCarFrame() {
        return new AudiCarFrame();
    }

    @Override
    public CarEngine createCarEngine() {
        return new AudiCarEngine();
    }
}
