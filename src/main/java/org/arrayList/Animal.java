package org.arrayList;

import java.util.Objects;

public class Animal {
    private String name;
    private final String[] abilities = {"run", "jump", "eat"};

    public String getAbility(int index) {
        return abilities[index];
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(getName(), animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }
}
