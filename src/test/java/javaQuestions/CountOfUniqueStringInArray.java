package javaQuestions;

import java.util.ArrayList;
import java.util.List;

public class CountOfUniqueStringInArray {

	public static void main(String[] args) {

		String[] animals = { "dog", "camel", "zebra", "cat", "monkey", "cow", "camel", "dog", "zebra", "monkey",
				"dog" };

		repeatCount(animals);
	}

	private static void repeatCount(String[] animals) {
		int count = 1;
		List<String> list = new ArrayList<>();

		for (int i = 0; i < animals.length; i++) {
			if (!list.contains(animals[i])) {
				for (int j = i + 1; j < animals.length; j++) {
					if (animals[i].contentEquals(animals[j])) {
						count++;
					}
				}
				list.add(animals[i]);
				System.out.println(animals[i] + " is repeated " + count + " times");
				count = 1;
			}
		}
	}
}
