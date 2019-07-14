package factory.abstractFactory;

import factory.Car;

public interface CarFactory {
    Car createCar();

    CarFrame createCarFrame();

    CarEngine createCarEngine();
}
