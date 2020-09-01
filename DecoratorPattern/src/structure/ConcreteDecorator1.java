package structure;

public class ConcreteDecorator1 extends Decorator{
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void methodA() {
        //example
        component.methodA();
    }

    @Override
    public void methodB() {

    }
}
