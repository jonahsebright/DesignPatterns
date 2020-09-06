package example;

import java.util.ArrayList;
import java.util.Random;

public class RandomAnimalFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return randomFromList(POSSIBLE());
    }
}
