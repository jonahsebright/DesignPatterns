package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class AnimalFactory {
    public abstract Animal createAnimal();

    public static ArrayList<Animal> POSSIBLE() {
       return new ArrayList<>(Arrays.asList(
                new Dog(),
                new Cat(),
                new Duck()
       ));
    }

    protected Animal randomFromList(ArrayList<Animal> list) {
        int i = new Random().nextInt(list.size());
        return list.get(i);
    }
}
