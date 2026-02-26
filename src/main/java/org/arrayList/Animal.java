package org.arrayList;

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
}
