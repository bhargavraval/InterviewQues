package javaQuestions;

public class OneAdvancedProg2 {

	// What will be the output of this program? Ans. Null Pointer Exception (trying to assign null value to integer)

	public static void main(String[] args) {

		/*
		 * int a = 80; int b = 100;
		 * 
		 * b = (Integer) null;
		 * 
		 * int area = getArea(a, b); System.out.println(area);
		 */
		
		
		
		int i=5;
		float f=i;
		double d=i;
		System.out.println(f);
		System.out.println(d);
				
		
		
		
		
		
	}

	private static int getArea(int a, int b) {
		return a * b;
	}
	
	private static int getarea(int a, int b) {
		return a * b;
	}

}
