package example;

public class LightUpCommand implements Command {

    private Light light;

    public LightUpCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.up();
    }

    @Override
    public void undo() {
        light.down();
    }
}
