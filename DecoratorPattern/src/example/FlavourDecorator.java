package example;

public abstract class FlavourDecorator extends Beverage {
    protected Beverage beverage;

    public FlavourDecorator(Beverage beverage){
        this.beverage = beverage;
    }
}
