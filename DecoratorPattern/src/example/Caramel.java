package example;

public class Caramel extends AddOnDecorator {
    public Caramel(Beverage beverage) {
        super(beverage);
    }


    @Override
    public double cost() {
        return beverage.cost() + 1;
    }

    @Override
    public String description() {
        return beverage.description();
    }
}
