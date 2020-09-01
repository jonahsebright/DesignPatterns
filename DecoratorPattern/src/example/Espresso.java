package example;

public class Espresso extends Beverage {

    @Override
    public double cost() {
        return 3;
    }

    @Override
    public String description() {
        return "An espresso which can be served with the optional caramel or whipped cream";
    }
}
