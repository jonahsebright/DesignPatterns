package example;

public class WhippedCream extends AddOnDecorator {

    public WhippedCream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 2;
    }

    @Override
    public String description() {
        return beverage.description();
    }
}
