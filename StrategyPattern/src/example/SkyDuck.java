package example;

public class SkyDuck extends Duck{
    public SkyDuck() {
        super(new SimpleQuachBehaviour(), new JetFlyBehaviour());
    }

    @Override
    public void display() {
        System.out.println("I am a sky duck");
    }
}
