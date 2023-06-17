	package javaQuestions;

public class GenerateFibonacciSeries {

	public static void main(String[] args) {

		int lenth = 6;

		getFibonacci(lenth);

	}

	private static void getFibonacci(int lenth) {
		int x = 0;
		int y = 0;
		int z = 1;

		while (lenth > 0) {
			x = y;
			y = z;
			z = x + y;
			System.out.print(x + " ");
			lenth--;
		}

	}

}
