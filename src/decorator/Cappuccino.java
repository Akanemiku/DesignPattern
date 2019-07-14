package decorator;

public class Cappuccino extends Beverage{
    public Cappuccino() {
        description = "Cappuccino Coffee";
    }

    @Override
    public double cost() {
        return 36;
    }
}
