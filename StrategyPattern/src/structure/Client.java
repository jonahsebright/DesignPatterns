package structure;

public class Client {
    private Behaviour behaviour;

    public Client(Behaviour behaviour) {
        this.behaviour = behaviour;
    }

    public void execute(){
        behaviour.run();
    }
}
