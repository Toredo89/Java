/**
 * Java 1. Homework 3
 *
 * @author Ruslan Khusnulgatin
 * @version 21.01.2022
 */

public class Lesson3Homework {
    public static void main(String[] args) {
        System.out.println("1:");
        invertArray();
        System.out.println("\n\n2:");
        fillArray();
        System.out.println("\n\n3:");
        changeArray();
        System.out.println("\n\n4:");
        createArray2();
        System.out.println("\n\n5:");
        createAndFllArray(5, 5);
    }

    static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.print("\n ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " ");
    }
}

    static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1, 6};
        System.out.print(" ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("\n ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
    }

    static void createArray2() {
        int length = 5; // length of array
        int[][] arr = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if ((i == j) || (i == length - 1 - j)) {
                    arr[i][j] = 1;
                }
            }
        }
        //CHECK
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[] createAndFllArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }
    static void printArrayInConsole(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++){
            System.out.println(inputArray[i] + " ");
        }
    System.out.println();
    }
}