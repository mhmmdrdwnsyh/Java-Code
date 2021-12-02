public class bool {
	public static void main(String[] agrs) {
		boolean x,y,z;
	/*
	 * Evaluation AND &
	 * Evaluation OR |
	 * Evaluation XOR ^
	 * Logical AND &&
	 * Logical OR ||
	 * Negation !
	 * Conditional ?:
	 * Equal-to ==
	 * Not equal !=
	 */
	
	//operasi dengan operator evaluasi OR / atau (|)
		System.out.println("========OR========");
		x = true;
		y = false;
		z = (x|y);
		System.out.println(x + " | " + y + " = " + z);

		x = true;
		y = true;
		z = (x|y);
		System.out.println(x + " | " + y + " = " + z);
		
		x = false;
		y = true;
		z = (x|y);
		System.out.println(x + " | " + y + " = " + z);
	
		x = false;
		y = false;
		z = (x|y);
		System.out.println(x + " | " + y + " = " + z);

	//operator evaluasi AND / dan (&)
		System.out.println(" ");
		System.out.println("========AND========");
		x = true;
		y = true;
		z = (x&y);
		System.out.println(x + " & " + y + " = " + z);
		
		x = true;
		y = false;
		z = (x&y);
		System.out.println(x + " & " + y + " = " + z);
		
		x = false;
		y = true;
		z = (x&y);
		System.out.println(x + " & " + y + " = " + z);
		
		x = false;
		y = false;
		z = (x&y);
		System.out.println(x + " & " + y + " = " + z);
		
		
		//operator logis OR (||)
		int a = 5;
		int b = 10;
		
		boolean test1 = (a > 10) || (b > 5);
		System.out.println(" ");
		System.out.println(test1);

	}
}
	

