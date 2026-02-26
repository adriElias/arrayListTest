package org.arrayList;

import org.junit.jupiter.api.Test;

import java.util.Optional;

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

    @Test
    void should_verify_optional_is_empty() {
        Optional<Animal> empty = Optional.empty();

        assertThat(empty).isEmpty();
    }

    @Test
    void should_verify_optional_animal_is_present() {
        Optional<Animal> animal = Optional.of(new Animal("Dog"));

        assertThat(animal).isPresent();
        assertThat(animal).contains(new Animal("Dog"));
    }
}
