package decorator;

public class Latte extends Beverage {
    public Latte() {
        description = "Latte Coffee";
    }

    @Override
    public double cost() {
        return 24;
    }
}
