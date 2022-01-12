public class Lesson-1 {
public static void main(String[] args) {
	ThreeWords()
	checkSumSign()
	printColor()
	compareNumbers()


	public static void ThreeWords() {
		System.out.println("Orange");
		System.out.println("Banana");
		System.out.println("Apple");
		}
	}
	public static void checkSumSign() {
		int a = 5;
		int b = 2; 

		if (a == 5) {
			System.out.println("Сумма положительная");
		}
		if (a > 5 && b < 2) {
			System.out.println("Сумма отрицательная");
		}
	public static void printColor() {
		int a = 102;
		if (a <= 0) {
			System.out.println("Красный");
		} else if (a > 0 || a <= 100) {
			System.out.println("Жёлтый");
		} else {
			System.out.println("Зеленый");
		}
	public static void compareNumbers() {
		int a = 10;
		int b = 6; 

		if (a >= b) {
			System.out.println("a >= b");
		}
		if (a > b && b < a) {
			System.out.println("a < b");
		}
		
	}
}		

}	
