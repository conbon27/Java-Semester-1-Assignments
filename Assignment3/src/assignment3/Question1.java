/* Andrew Conway 
 * ID: 08101179 
 * CT 874: Programming 1  
 */
package assignment3;

import java.util.Scanner;
// select & bring in the scanner utility from program so user input can be made.
import java.text.DecimalFormat;

// select & bring in the decimal format text from program so decimal places can be set.
public class Question1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat("0");
		// activating the decimal format & setting it to 2 places.

		System.out.print("1. Fahrenheit to Celsius" + System.lineSeparator() + "2. Celsius to Fahrenheit"
				+ System.lineSeparator() + "3. Exit \n");
		// prints out the initial text instruction requesting user input
		System.out.println("Choice: ");
		Scanner input = new Scanner(System.in);
		// activating the scanner tool within the class.
		int choice = input.nextInt();
		// takes user input into program & uses it to direct while/switch 1st

		while (choice != 3) {
			// while loop conditioning an action while input doesn't = 3
			switch (choice) {
			// switch function enabled setting out alts + default actions
			case 1:
				System.out.println("Enter temperature: ");
				double temper = input.nextDouble();
				// calls for user input which will be used as temperature in
				// method
				double celsius = celsius(temper);
				// calls the celsius method from outside the main method
				System.out.println(
						df.format(temper) + " degrees Fahrenheit is " + df.format(celsius) + " degrees Celsius.");
				// prints out the temperature conversion from faherenheit to
				// celsius based on user input
				System.out.print("1. Fahrenheit to Celsius" + System.lineSeparator() + "2. Celsius to Fahrenheit"
						+ System.lineSeparator() + "3. Exit \n");
				// prints out the initial text instruction again
				System.out.println("Choice: ");
				choice = input.nextInt();
				// asks & reads user input & runs it through while/switch
				// protocol
				break; // ends switch back to while loop
			case 2:
				System.out.println("Enter temperature: ");
				temper = input.nextDouble();
				// calls for user input which will be used as temperature in
				// method
				double fahrenheit = fahrenheit(temper);
				// calls the fahrenheit method from outside the main method
				System.out.println(
						df.format(temper) + " degrees Celsius is " + df.format(fahrenheit) + " degrees Fahrenheit.");
				// prints out the temperature conversion from celsius to
				// fahrenheit based on user input
				System.out.print("1. Fahrenheit to Celsius" + System.lineSeparator() + "2. Celsius to Fahrenheit"
						+ System.lineSeparator() + "3. Exit \n");
				// prints out the initial text instruction again
				System.out.println("Choice: ");
				choice = input.nextInt();
				// asks & reads user input & runs it through while/switch
				// protocol
				break; // ends switch back to while loop
			case 3:
				System.out.println("Program Terminated");
				break; // ends switch back to while loop
			default:
				System.out.println("Input error: Please enter number between 1 - 3");
				// requests the user to input the correct number
				System.out.println("Choice: ");
				//
				choice = input.nextInt();
				// asks & reads user input & runs it through while/switch
				// protocol
				break; // ends switch back to while loop
			} // ends switch
		} // ends while as selection =3, terminates program
		System.out.println("Program Terminated");
		// if condition is not met, program will end printing the above
		// does computation
		// resets boolean
		input.close();
		// closes scanner input
	} // ends method

	public static double celsius(double temper) {
		// declares two double variables outside of main method
		double celsius = 0.5555 * (temper - 32);
		// sets what the celsius double is equal to for the main method
		return celsius;
		// calling celsius will return the celsius value
	} // closes method

	public static double fahrenheit(double temper) {
		// declares two double variables outside of main method
		double fahrenheit = 1.8 * temper + 32;
		// sets what the fahrenheit double is equal to for the main method
		return fahrenheit;
		// calling method will return the fahrenheit value
	} // closes method
} // closes class
