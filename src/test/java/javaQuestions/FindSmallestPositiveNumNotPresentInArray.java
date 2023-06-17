package javaQuestions;

import java.util.HashSet;
import java.util.Set;

public class FindSmallestPositiveNumNotPresentInArray {

	/*
	 * There is an array of numbers (including negative), which may contain
	 * duplicates Find the smallest positive number, which is not present in the
	 * array
	 */

	public static void main(String[] args) {

		int[] nums = { 2, 1, -9, -15, 4, 7, 8, 5, 2, 3, 6, -23, 9, 22, 23, 6, 4, 1, 2, 5, 4, 7, 8, -5, 10, 11, 12, 13,
				14, 15, 16, 17, 18, 19, 20, 21, 22, 25 };

		System.out.println("Smallest positive missing number is: " + findSmallestMissingNum(nums));

	}

	private static int findSmallestMissingNum(int[] nums) {

		int missingNum = 0;
		Set<Integer> set = new HashSet<>();

		for (int i : nums) {
			if (i > 0) {
				set.add(i);
			}
		}

		System.out.println(set);
		for (int i = 1; i <= set.size(); i++) {
			if (!set.contains(i)) {
				missingNum = i;
				break;
			}
		}

		if (missingNum == 0) {
			missingNum = -1;
		}
		return missingNum;
	}

}
