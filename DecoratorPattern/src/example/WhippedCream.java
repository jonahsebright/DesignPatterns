package example;

public class WhippedCream extends FlavourDecorator {

    public WhippedCream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 1;
    }

    @Override
    public String description() {
        return beverage.description() + " with whipped cream";
    }
}
