package javaQuestions;

public class SwapTwoNumsWithoutThirdNum {

	public static void main(String[] args) {

		int x = 15;
		int y = 21;

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("Value is x: " + x);
		System.out.println("Value is y: " + y);

	}

}
