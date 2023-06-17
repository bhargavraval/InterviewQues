package javaQuestions;

public class ReverseWordsInSentence {

	public static void main(String[] args) {

		String sen = "Java is an object oriented language";

		System.out.println(reverseWords(sen));

	}

	private static String reverseWords(String sen) {

		String[] words = sen.split(" ");
		String newSen = "";

		for (int i = 0; i < words.length; i++) {
			for (int j = words[i].length() - 1; j >= 0; j--) {
				newSen = newSen + words[i].charAt(j);
			}
			newSen = newSen + " ";
		}

		return newSen;
	}

}
