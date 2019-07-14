package factory.factoryPattern;

import factory.AudiA8;
import factory.Car;

public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new AudiA8();
    }
}
