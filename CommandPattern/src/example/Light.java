package example;

public class Light {

    public static final int MIN = 0;
    public static final int MAX = 5;

    private int brightness = MIN;
    private int prevBrightness = MIN;

    public boolean isOn() {
        return brightness > MIN;
    }

    public int getBrightness() {
        return brightness;
    }

    public void on() {
        if(prevBrightness == MIN) prevBrightness = MAX;
        brightness = prevBrightness;
    }

    public void off() {
        brightness = MIN;
    }

    public void up() {
        if (brightness < MAX) brightness++;
        prevBrightness = brightness;
    }

    public void down() {
        if (brightness > 0) brightness--;
        prevBrightness = brightness;
    }
}
