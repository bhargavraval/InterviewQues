package javaQuestions;

public class FindSecondHighestNumArray {

	public static void main(String[] args) {

//		int[] nums = { 7, 4, 1, -2, 5, 8, -9, 6, 3, 0, 21, -45, 58, 74, 141, 23, 65, 45, 59, 18 };

		int[] nums = { 1 };
		System.out.println("Second highest number in array is: " + finsSecondHighestNum(nums));

	}

	private static int finsSecondHighestNum(int[] nums) {

		int highestNum = Integer.MIN_VALUE;
		int secondHighestNum = Integer.MIN_VALUE;

		// find the highest number in array
		for (int temp : nums) {
			if (temp > highestNum) {
				highestNum = temp;
			}
		}

		// find second highest number in array
		for (int temp : nums) {
			if (temp != highestNum) {
				if (temp > secondHighestNum) {
					secondHighestNum = temp;
				}
			}
		}

		if (secondHighestNum == Integer.MIN_VALUE) {
			secondHighestNum = -1;
		}
		return secondHighestNum;
	}

}
