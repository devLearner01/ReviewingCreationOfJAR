package packaging;

import java.util.Scanner;

public class Packaging {

	public static void packaging() {

		System.out.println("write max number to sum: ");
		Scanner scan = new Scanner( System.in );
		int input = scan.nextInt();

		System.out.println("result nSum: " + Operations.nSum(input));

		System.out.println("write number to get factorial: ");
		input = scan.nextInt();
		System.out.println("result factorial: " + Operations.factorial(input));

		System.out.println("write number to get fibonacci: ");
		input = scan.nextInt();
		System.out.println("result fibonacci: " + Operations.fibonacci(input));

	}


}
