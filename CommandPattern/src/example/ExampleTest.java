package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import structure.Invoker;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    @Test
    public void test(){
        Light light = new Light();
        LightInvoker invoker = new LightInvoker(
                new LightOnCommand(light),
                new LightOffCommand(light),
                new LightUpCommand(light),
                new LightDownCommand(light));

        invoker.onClickOff();
        assertEquals(0, light.getBrightness());
        assertFalse(light.isOn());

        invoker.onClickOn();
        assertEquals(5, light.getBrightness());
        assertTrue(light.isOn());

        invoker.onClickDown();
        invoker.onClickDown();
        assertEquals(3, light.getBrightness());
        assertTrue(light.isOn());

        invoker.onClickOff();
        invoker.onClickOn();
        assertEquals(3, light.getBrightness());
        assertTrue(light.isOn());

        invoker.onClickDown();
        invoker.onClickDown();
        invoker.onClickUp();
        assertEquals(2, light.getBrightness());

        invoker.onClickDown();
        invoker.onClickDown();
        assertEquals(0, light.getBrightness());
        assertFalse(light.isOn());
    }
}
