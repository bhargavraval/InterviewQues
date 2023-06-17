package javaQuestions;

public class SortIntegerArrayDesc {

	public static void main(String[] args) {
		int[] nums = { 5, 4, 6, 9, 8, 5, 2, 1, 4, 7, 8, 5, 2, 3, 6, 9, 8 };

		for (int i : nums) {
			System.out.print(i + " ");
		}
		System.out.println();

		int[] sortedNums = sortArray(nums);

		for (int i : sortedNums) {
			System.out.print(i + " ");
		}
	}

	private static int[] sortArray(int[] nums) {

		int temp = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] < nums[j]) {
					temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}
		return nums;
	}

}
