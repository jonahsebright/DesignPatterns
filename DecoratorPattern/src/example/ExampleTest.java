package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    @Test
    public void test() {
        Beverage withCaramel = new Caramel(new Espresso());
        assertEquals(3 + 2,withCaramel.cost());
        assertEquals("An espresso with caramel", withCaramel.description());

        Beverage withWhippedCream = new WhippedCream(new Espresso());
        assertEquals(3 + 1, withWhippedCream.cost());
        assertEquals("An espresso with whipped cream", withWhippedCream.description());

        Beverage withCaramelWhippedCream = new Caramel(new WhippedCream(new Espresso()));
        assertEquals(3 + 2 + 1, withCaramelWhippedCream.cost());

        Beverage withWhippedCreamCaramel = new WhippedCream(new Caramel(new Espresso()));
        assertEquals(3 + 1 + 2, withWhippedCreamCaramel.cost());

        Beverage withTwoCaramel = new Caramel(new Caramel(new Espresso()));
        assertEquals(3 + 2 * 2, withTwoCaramel.cost());
    }
}
