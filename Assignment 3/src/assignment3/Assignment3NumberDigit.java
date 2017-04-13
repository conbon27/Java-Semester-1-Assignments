/* Andrew Conway
 * Student ID: 08101179
 * CT 874: Programming 1
 * Question 1: Number of Digits
 */ 
package assignment3;

import java.util.Scanner;
//select & bring in the scanner utility so that user input can be gleamed 

public class Assignment3NumberDigit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// initializes scanner in the main method.

		
		int digit = 0;
		// declare & initialize variable integer digit at default value
		System.out.println("This program counts the number of digits in an integer entered by the user." + System.lineSeparator());
		// prints out the line of exposition of the program's purpose
		System.out.println("Enter -1 to exit");
		// gives user instruction as to how to exit/terminate the program
					
		while (digit !=-1) {
			// loop created that while the number entered as digit is not -1, following will happen:
			
			System.out.println("Enter Number: ");
			// requires user input for the number to be entered and read by the program
			digit = input.nextInt();
			// instruction to request user input and this to be registered to the integer digit
			if(digit ==-1) {
				System.out.println("Program Terminated . . . ");
			}
			else {
			System.out.println("Number of digits in " + digit + " is " + Integer.toString(digit).length());
			// prints out quantity of digits in the digit variable after conversion from integer to a String using toString
			}
		} // end while loop
			// gives alternative text output as loop is terminated for -1 input.
		input.close();
		// Closes the scanner as an input
	}// end method

} // end class



