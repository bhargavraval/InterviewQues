package javaQuestions;

import java.util.ArrayList;
import java.util.List;

public class CountUniqueCharInString {

	public static void main(String[] args) {

		String sen = "Java is an object oriented language";

		showUniqueCharCount(sen);

	}

	private static void showUniqueCharCount(String sen) {
		int count = 1;
		List<Character> list = new ArrayList<>();

		for (int i = 0; i < sen.length(); i++) {
			if (!list.contains(sen.charAt(i)) && sen.charAt(i) != ' ') {
				for (int j = i + 1; j < sen.length(); j++) {
					if (sen.charAt(i) == sen.charAt(j)) {
						count++;
					}
				}
				System.out.println(sen.charAt(i) + " is repeated " + count + " times in the sentence");
				list.add(sen.charAt(i));
				count = 1;
			}
		}

	}

}
