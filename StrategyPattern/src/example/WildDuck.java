package example;

public class WildDuck extends Duck{
    public WildDuck() {
        super(new NoQuachBehaviour(), new WildFlyBehaviour());
    }

    @Override
    public void display() {
        System.out.println("I am a wild duck");
    }
}
