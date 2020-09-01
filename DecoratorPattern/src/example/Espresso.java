package example;

public class Espresso extends Beverage {

    public static final String ESPRESSO_DESCRIPTION =
            "An espresso";

    @Override
    public double cost() {
        return 3;
    }

    @Override
    public String description() {
        return ESPRESSO_DESCRIPTION;
    }
}
