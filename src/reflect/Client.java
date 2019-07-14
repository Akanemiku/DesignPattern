package reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Client {
    @Test
    public void test() {
        try {

            Class clazz = Audi.class;
            //调用无参构造函数
            Car car = (Car) clazz.newInstance();
            //调用无参方法
            Method method = clazz.getMethod("show");
            method.invoke(car);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2() {
        try {

            Class clazz = Class.forName("reflect.Audi");
            //调用有参构造函数
            Constructor c = clazz.getConstructor(String.class);//传入类名.class
            Car car = (Car) c.newInstance("pink");

            //调用有参方法
            Method method = clazz.getMethod("show", String.class);//传入类名.class
            method.invoke(car, "green");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
