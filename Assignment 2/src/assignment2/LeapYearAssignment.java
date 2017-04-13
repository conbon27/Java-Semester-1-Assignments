/* Andrew Conway
 * Student ID: 08101179
 * CT 874: Programming 1
 * Question 2: Leap Year
 */ 

package assignment2;

import java.util.Scanner;
// select & bring in the scanner utility so that user input can be gleamed 

public class LeapYearAssignment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// initialize scanner in the main method.
		int leap = 0; 
		// declare and initialize the variable leap, corresponding to leap year.

		System.out.print("Enter the year you wish to check for leaps occuring: ");
		leap = input.nextInt(); // outputs the request for a user to input the
								// year that you want the program to check

		input.close(); //Closes the scanner as no further user input required.
		
		if ((leap % 4 == 0) && (leap % 100 != 0)) { 
			// if conditions, stating a leap year is divisible by 4 but not 100
			System.out.println(leap + " is a Leap Year");
		} // print out the year typed in is a leap year if it complies with the
			// conditions.
		else if ((leap % 400 == 0) && (leap % 100 == 0) && (leap % 4 == 0)) { 
			// or a leap year can be divided by 100 if it divisible by 4 & 400
			System.out.println(leap + " is a Leap Year");
		} else { // otherwise if it doesn't comply with the conditions, it isn't
					// a leap year and will thus state that.
			System.out.println(leap + " is not a Leap Year");
		} // end loop
	}// end method
}// end class
