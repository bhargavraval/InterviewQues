package javaQuestions;

import java.util.Scanner;

public class FindFactorial1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		System.out.println(findFactorial(num));

	}

	private static int findFactorial(int num) {

		if (num == 0) {
			return 0;
		}

		int fact = 1;

		while (num > 0) {
			fact = fact * num;
			num--;
		}

		return fact;
	}
}
