package javaQuestions;

public class CountOfUniqueVowels2 {

	public static void main(String[] args) {

		String sen = "Java is an object oriented language";

		vowelCount(sen);
	}

	private static void vowelCount(String sen) {

		int count = 0;
		String vowels = "aeiou";
		sen = sen.toLowerCase();

		for (int i = 0; i < vowels.length(); i++) {
			for (int j = 0; j < sen.length(); j++) {
				if ((vowels.charAt(i)) == sen.charAt(j)) {
					count++;
				}
			}
			System.out.println(vowels.charAt(i) + " is repeated " + count + " times in the sentence");
			count = 0;
		}
	}
}
