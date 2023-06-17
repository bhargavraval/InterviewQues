package javaQuestions;

public class FindMissingNumberInArray {

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

		// sort the array in ascending order
		int temp = 0;
		int missingNum = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}

		// compare consecutive numbers to find the missing number
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] + 1 != nums[i + 1]) {
				missingNum = nums[i] + 1;
			}
		}

		return missingNum;
	}

}
