package javaQuestions;

import java.util.ArrayList;
import java.util.List;

public class CountOfUniqueNumbersInList {

	public static void main(String[] args) {

		int[] nums = { 4, 5, 5, 5, 4, 6, 6, 9, 4, 7, 4 };
		List<Integer> list = new ArrayList<>();
		List<Integer> uniqList = new ArrayList<>();
		int count = 1;

		for (int i : nums) {
			list.add(i);
		}

		for (int i = 0; i < list.size(); i++) {
			if (!uniqList.contains(list.get(i))) {
				for (int j = i + 1; j < list.size(); j++) {
					if (list.get(i) == list.get(j)) {
						count++;
					}
				}
				uniqList.add(list.get(i));
				System.out.println(list.get(i) + " is repeated " + count + " times");
				count = 1;
			}
		}

	}

}
