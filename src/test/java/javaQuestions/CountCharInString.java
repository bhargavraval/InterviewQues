package javaQuestions;

public class CountCharInString {

	public static void main(String[] args) {

		String sen = "Java is an object oriented language";
		char c = 'e';

		countChar(sen, c);

	}

	private static void countChar(String sen, char c) {

		int count = 0;
		char[] chars = sen.toCharArray();

		for (char temp : chars) {
			if (temp == c) {
				count++;
			}
		}

		System.out.println(c + " is repeated " + count + " times in the string");

	}

}
