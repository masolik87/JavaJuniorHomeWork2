package org.example;

public class Dog extends Animal{
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void makeSound() {
        System.out.println("Гав");
    }
    public void toGuard() { // команда охранять
        System.out.println("Собака охраняет");
    }
}
