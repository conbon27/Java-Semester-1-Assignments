package assignment7;

// import utility scanner to allow for the creation of user inputs
import java.util.ArrayList;
import java.util.Scanner;

// import Array List utility so they can be used in main method
public class SalesTester {

	public static void main(String[] args) {
		// main method
		ArrayList<SalesEmployee> revenue = new ArrayList<SalesEmployee>();
		// Creates new Array List from superclass SalesEmployee to contain user
		// inputs.
		Scanner string_input = new Scanner(System.in);
		Scanner double_input = new Scanner(System.in);
		// Creates & initializes new scanners for user inputs.

		for (int x = 0; x < 2; x++) {
			revenue.add(new SalesAgent());
			// adds a new instance of sub class SalesAgent in array list revenue
			System.out.println("Please enter first name of Sales Agent: ");
			revenue.get(x).setFirstName(string_input.nextLine());
			System.out.println("Please enter last name of Sales Agent: ");
			revenue.get(x).setLastName(string_input.nextLine());
			System.out.println("Please enter PPS number of Sales Agent: ");
			revenue.get(x).setPPS(string_input.nextLine());
			System.out.println("Please enter Total Sales of Sales Agent: ");
			revenue.get(x).sales = double_input.nextDouble();
			// user inputs used to add new entries in array list for inherited
			// variables
			// uses getters to allow input

		} // closes for loop

		for (int z = 2; z < 4; z++) {
			revenue.add(new SalesPerson());
			// adds a new instance of sub class SalesAgent in array list revenue
			System.out.println("Please enter first name of Sales Person: ");
			revenue.get(z).setFirstName(string_input.nextLine());
			System.out.println("Please enter last name of Sales Person: ");
			revenue.get(z).setLastName(string_input.nextLine());
			System.out.println("Please enter PPS number of Sales Person: ");
			revenue.get(z).setPPS(string_input.nextLine());
			System.out.println("Please enter Total Sales of Sales Person: ");
			revenue.get(z).sales = double_input.nextDouble();
			// user inputs used to add new entries in array list for inherited
			// variables
			// uses getters to allow input & accessor for sales
		} // closes for loop
		string_input.close();
		double_input.close();
		// closes scanner inputs to prevent further user input

		for (SalesEmployee y : revenue) {
			// enhanced for loop stating that for every sales employee in
			// revenue
			y.calculateCommission();
			// invokes calculateCommission for all entries in revenue array list
		} // closes for
	} // closes main method

} // closes class
