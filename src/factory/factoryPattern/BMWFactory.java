package factory.factoryPattern;

import factory.BMWX6;
import factory.Car;

public class BMWFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BMWX6();
    }
}
