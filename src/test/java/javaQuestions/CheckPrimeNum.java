package javaQuestions;

public class CheckPrimeNum {

	public static void main(String[] args) {
		int num = 15;

		boolean isPrime = checkPrime(num);

		if (isPrime) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}

	}

	private static boolean checkPrime(int num) {
		boolean isPrime = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}

}
