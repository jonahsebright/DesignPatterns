package example;

public class LightDownCommand implements Command {

    private Light light;

    public LightDownCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.down();
    }

    @Override
    public void undo() {
        light.up();
    }
}
