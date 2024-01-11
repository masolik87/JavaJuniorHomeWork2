package org.example;

import java.lang.reflect.Method;

/* Создайте абстрактный класс "Animal" с полями "name" и "age".
Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat") с уникальными полями и методами.
Создайте массив объектов типа "Animal" и с использованием Reflection API выполните следующие действия:
Выведите на экран информацию о каждом объекте.
Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.
*/
public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Dog("Шкипер", 4, "Доберман"),
                new Dog("Ковальски", 1, "Ротвейлер"),
                new Cat("Рико", 5, "Домашний"),
                new Cat("Прапор", 7, "Дикий")
        };

        for (Animal animal : animals) {
            System.out.printf(animal.getClass().getSimpleName() + ":" + " ");
            System.out.printf("Кличка: " + animal.name + ", ");
            System.out.printf("Возраст: " + animal.age + ", ");

            try {
                Method method = animal.getClass().getMethod("makeSound");
                method.invoke(animal);
            } catch (Exception e) {
                System.out.println("Метод не найден");
            }
        }
    }
}