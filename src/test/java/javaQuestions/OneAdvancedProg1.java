package javaQuestions;

public class OneAdvancedProg1 {

	// What will be the output of this program? Ans. null56

	public static void main(String[] args) {

		System.out.println(getAns(null));

	}

	private static String getAns(String s) {

		s = s + 56;
		return s;
	}

}
