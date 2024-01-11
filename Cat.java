package org.example;

public class Cat extends Animal {
    private String type;

    public Cat(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    public void makeSound() {
        System.out.println("Мяу");
    }
    public void catchesMice() { // ловит мышей
        System.out.println("Кошка ловит мышей");
    }
}
