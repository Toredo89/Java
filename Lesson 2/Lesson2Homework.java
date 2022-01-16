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
        doFour("5");
    }

    static boolean doOne(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    static void doTwo(int a) {
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

    static boolean doTree(int a) {
        if (a < 0) return true;
        return false;
    }

	/*6 - 7. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, 
             указанное количество раз;*/

    static void doFour(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.println("2022Year" + i);
        }
    }
}