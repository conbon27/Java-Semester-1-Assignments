/*
 * Andrew Conway
 * ID: 08101179
 * CT 874: Programming 1 
 * 
 */
package assignment1;

import java.util.Scanner;
// select & bring in the scanner utility from program so user input can be made
import java.text.DecimalFormat;
//select & bring in the decimal format text from program so decimal places can be set

public class ConcertSales {
// Class Name based on end result
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// activating the scanner tool within class
		
		DecimalFormat df = new DecimalFormat("€ 0.00");
		// activating the decimal format and setting it to 2 places
		
		int ticketASold, ticketBSold, ticketCSold;
		double ticketAPrice, ticketBPrice, ticketCPrice, TotalConcertSales;
		// Declare and activate variables which are either numbers or numbers with decimal places.
			
		System.out.print("Enter A Tickets sold: ");
		ticketASold = input.nextInt(); // calls for first number of tickets
		System.out.print("Enter A Ticket Price: ");
		ticketAPrice = input.nextDouble(); // calls for first ticket price
		System.out.print("Enter B Tickets sold: ");
		ticketBSold = input.nextInt(); // calls for second number of tickets
		System.out.print("Enter B Ticket Price: ");
		ticketBPrice = input.nextDouble(); // calls for second ticket price
		System.out.print("Enter C Tickets sold: ");
		ticketCSold = input.nextInt(); // calls for third number of tickets
		System.out.print("Enter C Ticket Price: ");
		ticketCPrice = input.nextDouble(); // calls for third ticket price
		
		// Asks the users for the input of the number of tickets sold by class (to be entered in to the console)
		// Asks the users for the input of the ticket price by class (to be entered in to the console)
		
		TotalConcertSales = (ticketASold * ticketAPrice) + (ticketBSold * ticketBPrice) + (ticketCSold * ticketCPrice);
		// Calculation of the total sales from multiplying and adding together each of the user inputs
		
		System.out.println("\n \t \t Tickets Sold \t Price per Ticket");
		System.out.println("\t \t ------------------------------");
		System.out.println("A Tickets" + "\t \t" + ticketASold + "\t \t" + df.format(ticketAPrice));
		System.out.println("B Tickets" + "\t \t" + ticketBSold + "\t \t" + df.format(ticketBPrice));
		System.out.println("C Tickets" + "\t \t" + ticketCSold + "\t \t" + df.format(ticketCPrice));
		System.out.println("\n \t \t" + "Total Sales € " + TotalConcertSales);
		// Selects and arranges the formatting of the system output, including formatting of the decimals to ensure the 0 is kept for 12.50
		
	input.close(); // Closes scanner input before ending program
	}//Close method
}//Close class
