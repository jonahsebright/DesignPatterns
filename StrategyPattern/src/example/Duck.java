package example;

public class Duck {
    private QuachBehaviour quachBehaviour;
    private FlyBehaviour flyBehaviour;

    public Duck(QuachBehaviour quachBehaviour, FlyBehaviour flyBehaviour) {
        this.quachBehaviour = quachBehaviour;
        this.flyBehaviour = flyBehaviour;
    }

    public void display(){
        System.out.println("I am a duck");
    }

    public void quach(){
        quachBehaviour.quach();
    }

    public void fly(){
        flyBehaviour.fly();
    }
}
