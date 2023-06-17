package javaQuestions;

import java.util.ArrayList;
import java.util.List;

public class GetUniqeSringValuesFromArray {

	public static void main(String[] args) {

		String[] animals = { "dog", "camel", "zebra", "cat", "monkey", "cow", "camel", "dog", "zebra", "monkey" };

		System.out.println(getUniqe(animals));

	}

	private static List<String> getUniqe(String[] animals) {

		List<String> list = new ArrayList<>();

		for (String str : animals) {
			if (!list.contains(str)) {
				list.add(str);
			}
		}

		return list;

	}

}
