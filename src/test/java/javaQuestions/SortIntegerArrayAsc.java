package javaQuestions;

public class SortIntegerArrayAsc {

	public static void main(String[] args) {

		int[] nums = { 4, 3, 9, 7, 5, 6, 1, 8, 5, 7, 3, 2, 9, 5, 4, 6 };

		int[] sortedNums = sortArray(nums);

		for (int i : sortedNums) {
			System.out.print(i + " ");
		}
	}

	private static int[] sortArray(int[] nums) {
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}
		return nums;
	}

}
