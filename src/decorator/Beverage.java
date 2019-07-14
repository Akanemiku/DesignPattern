package decorator;

public abstract class Beverage {
    public String description = "Unkonewn Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
