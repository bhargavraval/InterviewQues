package javaQuestions;

import java.util.ArrayList;
import java.util.List;

public class FindVowelCount {

	public static void main(String[] args) {

		String sen = "Java is an object oriented language";

		System.out.println(findVowelCount(sen));

	}

	private static int findVowelCount(String sen) {

		sen = sen.toLowerCase();
		int vowelCount = 0;
		String vowelStr = "aeiou";
		List<Character> list = new ArrayList<>();

		for (int i = 0; i < vowelStr.length(); i++) {
			list.add(vowelStr.charAt(i));
		}

		System.out.println(list);

		for (int i = 0; i < sen.length(); i++) {
			if (list.contains(sen.charAt(i))) {
				vowelCount++;
			}
		}

		return vowelCount;

	}

}
