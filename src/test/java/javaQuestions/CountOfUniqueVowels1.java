package javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountOfUniqueVowels1 {

	public static void main(String[] args) {

		String sen = "Java is an object oriented language";

		vowelCount(sen);

	}

	private static void vowelCount(String sen) {

		sen = sen.toLowerCase();
		List<Character> list = new ArrayList<>();

		for (int i = 0; i < sen.length(); i++) {
			list.add(sen.charAt(i));
		}

		System.out.println("a is repeated " + Collections.frequency(list, 'a') + " times");
		System.out.println("e is repeated " + Collections.frequency(list, 'e') + " times");
		System.out.println("i is repeated " + Collections.frequency(list, 'i') + " times");
		System.out.println("o is repeated " + Collections.frequency(list, 'o') + " times");
		System.out.println("u is repeated " + Collections.frequency(list, 'u') + " times");
	}

}
