package javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountOfUniqueNumbersInList2 {

	public static void main(String[] args) {

		int[] nums = { 4, 5, 5, 5, 4, 6, 6, 9, 4, 7, 4 };
		List<Integer> list = new ArrayList<>();

		for (int i : nums) {
			list.add(i);
		}

		Set<Integer> set = new HashSet<>(list);

		for (int i : set) {
			System.out.println(i + " is repeated " + Collections.frequency(list, i) + " times");
		}

	}

}
