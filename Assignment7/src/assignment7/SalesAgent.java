package assignment7;

public class SalesAgent extends SalesEmployee {

	public SalesAgent() {
		// default constructor
	} // closes public constructor

	public SalesAgent(String firstName, String lastName, String ppsNumber) {
		// public constructors for extended variables
	} // closes public constructor

	@Override
	public void calculateCommission() {
		// unimplemented inherited method from abstract super class
		// initiates double sum - override
		commission = sales * .15;
		// actual calculation for commission based on sales user input
		System.out.println("Sales Agent:" + System.lineSeparator() + toString());
		// toString override from SalesEmployee superclass using tester info
	}// closes voided method

} // closes class
