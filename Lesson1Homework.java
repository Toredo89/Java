/**
 * Java 1. Homework 1
 *
 * @author Ruslan Khusnulgatin
 * @version 14.01.2022
 */
class Lesson1Homework {

    public static void main(String[] args) {
        ThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void ThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 5;
        int b = 2; 
        System.out.println("The sum is" + (a + b >= 0? "Positive" : "Negative"));
    }

    static void printColor() {
        int a = 99;
        if (a <= 0) {
            System.out.println("Red");
        } else if (a <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    static void compareNumbers() {
        int a = 10;
        int b = 6;
        System.out.println(a >= b? "a >= b" : "a < b");
    }
}