package example;

public class LightInvoker {
    private Command on;
    private Command off;
    private Command up;
    private Command down;

    public LightInvoker(Command on, Command off, Command up, Command down) {
        this.on = on;
        this.off = off;
        this.up = up;
        this.down = down;
    }

    public void onClickOn(){
        on.execute();
    }

    public void onClickOff(){
        off.execute();
    }

    public void onClickUp(){
        up.execute();
    }

    public void onClickDown(){
        down.execute();
    }
}
