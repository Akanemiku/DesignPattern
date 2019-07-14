package factory;

import factory.abstractFactory.CarEngine;
import factory.abstractFactory.CarFrame;
import factory.factoryPattern.AudiFactory;
import factory.factoryPattern.BMWFactory;
import factory.factoryPattern.CarFactory;
import factory.simpleFactory.SimpleCarFactory;
import org.junit.Test;

public class test {

    @Test
    /*
     * 简单工厂
     * 集中封装类的实现
     * */
    public void simpleFactoryTest() {
        SimpleCarFactory factory = new SimpleCarFactory();
        Car car = factory.createCar("AudiA8");
        car.startUp();
        car.run();

        car = factory.createCar("BMWX6");
        car.startUp();
        car.run();
    }

    @Test
    /*
     * 工厂模式
     * 将new放到具体工厂中去
     * 用什么样的工厂，得到什么样的产品
     * */
    public void factoryTest() {
        CarFactory factory = new AudiFactory();
        Car car = factory.createCar();
        car.startUp();
        car.run();
    }

    @Test
    /*
     * 抽象工厂模式
     * Audi工厂生产的框架、引擎都由Audi工厂生产
     * 更改时只需改new后的类即可
     * */
    public void abstractFactoryTest() {
        factory.abstractFactory.CarFactory factory = new factory.abstractFactory.AudiFactory();
        Car car = factory.createCar();
        CarFrame carFrame = factory.createCarFrame();
        CarEngine carEngine = factory.createCarEngine();
    }
}
