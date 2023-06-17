package javaQuestions;

import java.util.Scanner;

public class FindFactorial2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		System.out.println(findFactorial(num));

	}

	private static int findFactorial(int num) {
		if (num == 0) {
			return 0;
		} else if (num > 1) {
			return num * findFactorial(num - 1);
		} else
			return 1;
	}
}
