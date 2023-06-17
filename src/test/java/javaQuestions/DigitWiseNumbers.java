package javaQuestions;

import java.util.LinkedList;
import java.util.List;

public class DigitWiseNumbers {

	/*
	 * input list of integer: 11 33 555 547 9999 101010 96 847 3333
	 * 
	 * output: 2 digits numbers: 11 33 96 
	 * 3 digits numbers: 555 547 847 
	 * 4 digits numbers: 9999 3333 
	 * 6 digits numbers: 101010
	 */
	
	// solution: https://stackoverflow.com/questions/59018640/how-can-i-group-numbers-in-a-list-by-their-number-of-digits

	public static void main(String[] args) {
		
		int[] nums= {11, 33, 555, 547, 9999, 101010, 96, 847, 3333};
		List<Integer> list = new LinkedList<>();
		
		for(int temp: nums) {
			list.add(temp);
		}

		digitCount(list);

	}

	static void digitCount(List<Integer> list) {
		int digit = 0;
		int num = 0;
		List<Integer> temp = new LinkedList<>();

		for (int i = 0; i < list.size(); i++) {
			num = list.get(i);
			while (num > 0) {
				num = num / 10;
				digit++;
			}
			if (digit == 1) {
				List<Integer> list1 = new LinkedList<>();
				list1.add(list.get(i));
			}
		}

	}
}
