package example;

import java.util.ArrayList;

public class BalancedAnimalFactory extends AnimalFactory {

    private ArrayList<Animal> remaining = new ArrayList<>();

    @Override
    public Animal createAnimal() {
        checkIfShouldAndRefillRemaining();
        Animal random = randomFromList(remaining);
        remaining.remove(random);
        return random;
    }

    private void checkIfShouldAndRefillRemaining() {
        if(remaining.size() == 0) remaining.addAll(POSSIBLE());
    }

    public void setRemaining(ArrayList<Animal> remaining) {
        this.remaining = remaining;
    }

    public ArrayList<Animal> getRemaining() {
        return remaining;
    }

    public void removeFromRemaining(Class<? extends Animal>... toRemove) {
        checkIfShouldAndRefillRemaining();
        ArrayList<Animal> newRemaining = new ArrayList<>(remaining);
        for (Animal animalRemaining : remaining) {
            for (Class<? extends Animal>  animalToRemove: toRemove) {
                if(animalRemaining.getClass().equals(animalToRemove))
                    newRemaining.remove(animalRemaining);
            }
        }
        remaining = newRemaining;
    }
}
