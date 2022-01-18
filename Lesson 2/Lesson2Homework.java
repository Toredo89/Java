/**
 * Java 1. Homework 2
 *
 * @author Ruslan Khusnulgatin
 * @version 16.01.2022
 */
public class Lesson2Homework {
    public static void main(String[] args) {
        System.out.println(doOne(5, 8));
        doTwo(-7);
        System.out.println(doTree(-1));
        doFour("Hello, men", 5);
    }

    static boolean doOne(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static void doTwo(int a) {
        System.out.println(a >= 0? "Positive" : "Negative");
    }

    static boolean doTree(int a) {
        if (a < 0) return true;
        return false;
    }

    static void doFour(String name) {
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
    }
}
