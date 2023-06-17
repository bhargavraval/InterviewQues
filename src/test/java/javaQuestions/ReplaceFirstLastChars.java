package javaQuestions;

public class ReplaceFirstLastChars {

	public static void main(String[] args) {

		String sen = "Java is an object oriented language";

		System.out.println(replaceFirstLastChars(sen));
	}

	private static char[] replaceFirstLastChars(String sen) {

		char[] chars = sen.toCharArray();
		int counter = 0;
		char temp;

		for (int i = 0; i < chars.length; i++) {
			counter = i;
			while (i < chars.length && chars[i] != ' ') {
				i++;
			}
			temp = chars[counter];
			chars[counter] = chars[i - 1];
			chars[i - 1] = temp;
		}

		return chars;

	}

}
