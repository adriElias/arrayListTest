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

    @Test
    void should_throw_exception_when_accessing_invalid_ability() {
        Animal animal = new Animal("Dog");

        assertThatThrownBy(() -> animal.getAbility(4))
                .isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }
}
