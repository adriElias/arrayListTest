package org.arrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ArrayListTest {
    private List<Object> list;
    private Animal animal;
    private Book book;
    private Phone phone;
    private Book newBook;

    @BeforeEach
    void setUp() {
        animal = new Animal("Cat");
        book = new Book("Harry Potter");
        phone = new Phone("Galaxy S pro");
        newBook = new Book("The butterfly effect");

        list = new ArrayList<>();
        list.add(animal);
        list.add(book);
        list.add(phone);
    }

    @Test
    void should_contain_objects_in_insertion_order() {
        assertThat(list).containsExactly(animal, book, phone);
    }

    @Test
    void should_contain_objects_in_any_order() {
        assertThat(list).containsExactlyInAnyOrder(book, phone, animal);
    }

    @Test
    void should_contain_book_only_once() {
        assertThat(list).containsOnlyOnce(book);
    }

    @Test
    void should_not_contain_not_added_book() {
        assertThat(list).doesNotContain(newBook);
    }
}
