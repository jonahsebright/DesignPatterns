package example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static example.AnimalFactory.POSSIBLE;
import static org.junit.jupiter.api.Assertions.*;

public class BalancedAnimalFactoryTest {

    private BalancedAnimalFactory balancedAnimalFactory;

    @BeforeEach
    void setUp() {
        balancedAnimalFactory = new BalancedAnimalFactory();
    }

    @Test
    public void canRemoveFromRemaining() {
        balancedAnimalFactory.setRemaining(POSSIBLE());
        balancedAnimalFactory.removeFromRemaining(Duck.class, Dog.class);
        assertEquals(1, balancedAnimalFactory.getRemaining().size());
        assertTrue(balancedAnimalFactory.getRemaining().get(0) instanceof Cat);

        balancedAnimalFactory.setRemaining(POSSIBLE());
        balancedAnimalFactory.removeFromRemaining(Cat.class);
        assertEquals(2, balancedAnimalFactory.getRemaining().size());
        Animal firstRemaining = balancedAnimalFactory.getRemaining().get(0);
        Animal secondRemaining = balancedAnimalFactory.getRemaining().get(1);
        assertTrue(firstRemaining instanceof Dog || firstRemaining instanceof Duck);
        assertTrue(secondRemaining instanceof Dog || secondRemaining instanceof Duck);
    }

    @Test
    public void createsBalancedAnimals() {
        balancedAnimalFactory.removeFromRemaining(Dog.class, Cat.class);
        assertTrue(balancedAnimalFactory.createAnimal() instanceof Duck);

        balancedAnimalFactory.setRemaining(POSSIBLE());

        Animal rand1 = balancedAnimalFactory.createAnimal();
        assertTrue(rand1 instanceof Dog || rand1 instanceof Cat || rand1 instanceof Duck);
        Animal rand2 = balancedAnimalFactory.createAnimal();
        Animal rand3 = balancedAnimalFactory.createAnimal();
        if(rand1 instanceof Dog){
            assertTrue(rand2 instanceof Cat || rand2 instanceof Duck);
            if(rand2 instanceof Cat) assertTrue(rand3 instanceof Duck);
            else assertTrue(rand3 instanceof Cat);
        }else if(rand1 instanceof Cat){
            assertTrue(rand2 instanceof Dog || rand2 instanceof Duck);
            if(rand2 instanceof Dog) assertTrue(rand3 instanceof Duck);
            else assertTrue(rand3 instanceof Dog);
        }else {
            assertTrue(rand2 instanceof Cat || rand2 instanceof Dog);
            if(rand2 instanceof Dog) assertTrue(rand3 instanceof Cat);
            else assertTrue(rand3 instanceof Dog);
        }
    }

}