package example;

public class CityDuck extends Duck{
    public CityDuck() {
        super(new SimpleQuachBehaviour(), new SimpleFlyBehaviour());
    }

    @Override
    public void display() {
        System.out.println("I am a city duck");
    }
}
