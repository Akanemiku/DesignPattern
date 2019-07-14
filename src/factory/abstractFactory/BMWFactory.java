package factory.abstractFactory;

import factory.BMWX6;
import factory.Car;

public class BMWFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BMWX6();
    }

    @Override
    public CarFrame createCarFrame() {
        return new BMWCarFrame();
    }

    @Override
    public CarEngine createCarEngine() {
        return new BMWCarEngine();
    }
}
