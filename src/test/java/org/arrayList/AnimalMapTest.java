package org.arrayList;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class AnimalMapTest {
    @Test
    void should_contain_key_in_map() {
        AnimalMap animalMap = new AnimalMap();
        animalMap.addAnimal(new Animal("Dog"));
        animalMap.addAnimal(new Animal("Cat"));

        assertThat(animalMap.getAnimals()).containsKey("Dog");
    }
}
