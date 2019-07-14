package factory.simpleFactory;

import factory.AudiA8;
import factory.BMWX6;
import factory.Car;

public class SimpleCarFactory {
    public Car createCar(String type) {
        if (type.equals("BMWX6")) {
            return new BMWX6();
        } else if (type.equals("AudiA8")) {
            return new AudiA8();
        }
        return null;
    }
}
