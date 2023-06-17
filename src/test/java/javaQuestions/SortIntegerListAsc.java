package javaQuestions;

import java.util.ArrayList;
import java.util.List;

public class SortIntegerListAsc {

	public static void main(String[] args) {
		int[] nums = { 1, 5, 9, 6, 3, 5, 7, 4, 1, 2, 5, 8, 9, 6, 3, 2, 5, 8 };
		List<Integer> list = new ArrayList<>();

		for (int i : nums) {
			list.add(i);
		}
		
		System.out.println(list);
		System.out.println(sortList(list));

	}

	private static List<Integer> sortList(List<Integer> list) {

		int temp;

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) > list.get(j)) {
					temp = list.get(j);
					list.set(j, list.get(i));
					list.set(i, temp);
				}
			}
		}

		return list;

	}

}
