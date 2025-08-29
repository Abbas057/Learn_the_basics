package java_basics;

import java.util.Scanner;

public class User_input {
	
	// a2 + b2 + 2ab

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Value of A: ");
		int a = scanner.nextInt();
		System.out.print("Enter Value of B: ");
		int b = scanner.nextInt();
		
		int c = ((a*a)+(b*b)+(2*(a*b)));
		
		System.out.println("Result :"+ c);
		
		// Int   		- nextInt();
		// Float    	- nextFloat();
		// word   		- next();
		// line   		- nextLine();
		// double   	- nextdouble();
		// Character    - next().charAt(0);
		
		scanner.close();

	}

}
