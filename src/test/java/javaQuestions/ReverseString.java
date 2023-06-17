package javaQuestions;

public class ReverseString {

	public static void main(String[] args) {

		String sen = "Java is an object oriented language";

		System.out.println(reverseString(sen));

	}

	private static String reverseString(String sen) {

		String newStr = "";

		for (int i = sen.length() - 1; i >= 0; i--) {
			newStr = newStr + sen.charAt(i);
		}

		return newStr;
	}

}
