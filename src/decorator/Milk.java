package decorator;

public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Milk";
    }

    @Override
    public double cost() {
        return 1+beverage.cost();
    }
}
