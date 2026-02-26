package org.arrayList;

import java.util.HashMap;
import java.util.Map;

public class AnimalMap {
    private final Map<String, Animal> animals = new HashMap<>();

    public void addAnimal(Animal animal) {
        animals.put(animal.getName(), animal);
    }

    public Map<String, Animal> getAnimals() {
        return animals;
    }
}
