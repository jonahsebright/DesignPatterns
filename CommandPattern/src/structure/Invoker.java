package structure;

public class Invoker {
    private Command command;

    public Invoker(ConcreteCommand concreteCommand) {
        this.command = concreteCommand;
    }

    public void onInvoked(){
        command.execute();
    }
}
