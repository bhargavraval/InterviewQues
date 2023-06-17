package javaQuestions;

import java.util.Arrays;

public class FindMissingNumberInArray2 {

	/*
	 * Array does not contain any duplicate values write a program to find missing
	 * number from a randomly placed series like 1,2,3,4,5,7,8 Here the missing
	 * number is 6 the sequence not necessarily be maintained in the array
	 */

	public static void main(String[] args) {

		int[] nums = { 3, 7, 9, 6, 4, 1, 2, 5 };

		System.out.println("Missing number in array is: " + findMissingNum(nums));

	}

	private static int findMissingNum(int[] nums) {

		// sort the array
		Arrays.sort(nums);

		int missingNum;
		int n = nums[nums.length - 1];

		// Expected sum formula
		int expSum = (n * (n + 1)) / 2;

		int actSum = 0;

		// actual sum
		for (int i : nums) {
			actSum = actSum + i;
		}

		// difference is the missing number
		missingNum = expSum - actSum;

		return missingNum;
	}

}
