package example;

public class Caramel extends FlavourDecorator {
    public Caramel(Beverage beverage) {
        super(beverage);
    }


    @Override
    public double cost() {
        return beverage.cost() + 2;
    }

    @Override
    public String description() {
        return beverage.description() + " with caramel";
    }
}
