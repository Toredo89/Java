/**
 * Java 1. Homework 7
 *
 * @author Ruslan Khusnulgatin
 * @version 02.02.2022
 */

class Lesson7Homework {
    public static void main(String[] args) {
        System.out.println("List of cats:");
        Cat[] x = {new Cat("Barsik", 5), new Cat ("Matroskin", 7), new Cat ("Tom", 15)};
        Plate plate = new Plate(50);
        for (Cat c : x) {
        System.out.println(c);
        }
        System.out.println("\n" + plate);
        System.out.println("***********************************************");
        System.out.println("increase food be 50");
        plate.increaseFood(50);
        //System.out.println(plate);
        System.out.println("***********************************************");
        System.out.println("Cats take food");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
            }
        //plate.setFood(plate.getFood() - cat.getAppetite());
        //plate.decreaseFood(cat.getAppetite());
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    public void eat(Plate plate) {
        if (plate.getAmountOfFood() > appetite) {
            plate.decreaseFood(appetite);
            isFull = true;
        }
    }

    @Override
    public String toString() {
        return "Cat: " + name + " | Appetite: " + appetite + "| Isfull: " + isFull;
    }
}

class Plate {
    private int amountOfFood;

    Plate(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    void decreaseFood(int appetite) {
        if (amountOfFood >= appetite) {
            amountOfFood -= appetite;
        }
    }

    int getAmountOfFood() {
        return amountOfFood;
    }

    void increaseFood(int amount) {
        amountOfFood += amount;
    }

    @Override
    public String toString() {
        return "Plate: " + amountOfFood;
    }
}