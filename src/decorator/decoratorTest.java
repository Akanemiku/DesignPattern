package decorator;

import org.junit.Test;

public class decoratorTest {
    @Test
    public void test1(){
        Beverage beverage = new Cappuccino();
        beverage = new Milk(beverage);
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription()+" ￥"+beverage.cost());
    }

    @Test
    public void test2(){
        Beverage beverage = new Milk(new Milk(new Latte()));
        System.out.println(beverage.getDescription()+" ￥"+beverage.cost());
    }
}
