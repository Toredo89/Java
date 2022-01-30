/**
 * Java 1. Homework 6
 *
 * @author Ruslan Khusnulgatin
 * @version 30.01.2022
 */

abstract class Animal {
    private final int MAX_RUN_LENGTH = 0;
    private final int MAX_SWIM_LENGTH = 0;
    abstract void run(int length);
    abstract void swim(int length);
    }

class Cat extends Animal {
    private final int MAX_RUN_LENGTH = 200;
    private final int MAX_SWIM_LENGTH = 0;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("Кот Барсик пробежал: 200м!");
        else System.out.println("run: false");
    }

    @Override
    void swim(int length) {
        System.out.println("Кот Барсик не умеет плавать!");
    }
}

class Dog extends Animal {
    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("Пес Бобик пробежал 500м!");
        else System.out.println("run: false");
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= MAX_SWIM_LENGTH)) System.out.println("Пес Бобик проплыл 10м!");
        else System.out.println("swim: false");
    }
}

public class Lesson6Homework {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run(200);
        cat.swim(0);

        Dog dog = new Dog();
        dog.run(500);
        dog.swim(10);
    }
}