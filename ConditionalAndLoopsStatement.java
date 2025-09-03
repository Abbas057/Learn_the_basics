package java_basics;

import java.util.Scanner;

public class ConditionalAndLoopsStatement {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// if statement

		int s = 10;

		if (s <= 10) {
			System.out.println("S is smaller than 20");
		}
		// if else statement

		int amount = 1000;
		int balance = 990;
		if (amount > balance) {
			System.out.println("Insufficient balance");
		} else {
			System.out.println("1000 Debited from your Account XXXX");
		}

		// nested if

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the mark: ");
		int marks = scanner.nextInt();
		if (marks >= 0 && marks <= 100) { // validate input
			if (marks >= 50) {
				if (marks >= 75) {
					if (marks >= 90) {
						System.out.println("Grade A");
					} else {
						System.out.println("Grade B");
					}
				} else {
					System.out.println("Grade C");
				}
			} else {
				System.out.println("Fail");
			}
		} else {
			System.out.println("Invalid marks! Enter between 0 and 100.");
		}

		// Switch statement
		System.out.print("Enter Number 1: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter Number 2: ");
		int num2 = scanner.nextInt();
		System.out.println("Enter Operator: (+,-,*,/,%): ");
		char operator = scanner.next().charAt(0);
		switch (operator) {
		case '+':
			System.out.println("Addition: " + (num1 + num2));
			break;
		case '-':
			System.out.println("Subtraction: " + (num1 - num2));
			break;
		case '*':
			System.out.println("Multiply: " + (num1 * num2));
			break;
		case '/':
			if (num2 == 0) {
				System.out.println("Cannot divide " + num1 + " by zero!");
			} else {
				System.out.println("Division = " + (num1 / num2));
			}
			break;
		case '%':
			if (num2 == 0) {
				System.out.println("Cannot divide " + num1 + " by zero!");
			} else {
				System.out.println("Modulos = " + (num1 % num2));
			}
			break;
		default:
			System.out.println("Invalid Operator!");
		

		}
		
	// Loop statement
		
	// do while
		
	int secretNumber=5;
	
	int guess;
	
	do {
		
		System.out.print("Guess the number between 1 to 10: ");
		guess = scanner.nextInt();
		
		if(guess !=secretNumber) {
			System.out.println("Wrong! Try again");
		}
		
		
		
	}while(guess!=secretNumber);
		
	System.out.print("Congratulations! You guessed it right.");
	
	// while loop
	
	System.out.print("Enter a number: ");
    int num = scanner.nextInt();

    int sum = 0;

    while (num > 0) {
        int digit = num % 10;   // extract last digit
        sum += digit;           // add it to sum
        num = num / 10;         // remove last digit
    }

    System.out.println("Sum of digits = " + sum);
    
   // For loop

 	for(int i = 0;i<=5;i++)
 	{
 		System.out.println("I =" + i);
 	}
 	
 	// Enhanced for loop
 	
 	int[] arr = {1,2,3,4,5};
 	
 	for(int values: arr) {
 		System.out.println(values);
 	}
 	

	// Nested for loop
	
	for(int i=0;i<=5;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println(" ");
		
	}
 	
		scanner.close();
	}
	

	
	

}

