/* Andrew Conway
 * Student ID: 08101179
 * CT874: Programming 1
 * Question 1: Array
 */

package assignment2;

import java.util.Scanner;
//select & bring in the scanner utility so that user input can be gleamed 

public class NumberArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// initializes scanner in the main method.

		int numArraySize;
		// declare & initialize the integer which describes the number of
		// objects within the array of this method

		System.out.println("Enter the size of the array you wish to interact with: ");
		numArraySize = input.nextInt();
		// requests the user to input the size of the array

		double[] numArray = new double[numArraySize];
		// constructor constructs new double array of size numArraySize
		// declares & initializes the new Array called numArray which is defined
		// by the dimensions set out by the user above

		for (int i = 0; i < numArraySize; i++) {
			// for loop asking for user to input numbers to populate each of the
			// instances within the array.
			System.out.println("Please Enter Number: ");
			// user input request statement which will appear.
			numArray[i] = input.nextDouble();
			// instructing that each user input will be input into the array
			// numArray.
		} // end loop

		input.close();
		// Closes input scanner so no more information can be entered.

		double sum = 0;
		// declares the variable sum as a double.

		for (int i = 0; i < numArraySize; i++) {
			// repeats the above for loop to call back the above data
			sum = sum + numArray[i];
			System.out.println("User entered: " + numArray[i]);
			// prints out the numbers that are in each instance of the array
			// declares that sum is equal to the total of the numbers existing
			// within the i numArray.
		} // end loop
		{
			System.out.println("Total of Numbers in Array = " + sum);
		} // prints out total of the objects held within numArray & closes
			// instruction.
	} // end method
} // end class