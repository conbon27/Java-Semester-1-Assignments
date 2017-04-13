package assignment7;

public class SalesPerson extends SalesEmployee {
	// class declaration extending superclass SalesEmployee
	public SalesPerson() {
		// default public constructor
	} // closes public constructor

	public SalesPerson(String firstName, String lastName, String ppsNumber) {
		// public constructors for extended variables

	} // closes public constructor

	@Override
	public void calculateCommission() {
		// unimplemented inherited method from abstract super class
		commission = sales * .10;
		// actual calculation for commission based on sales user input
		System.out.println("Sales Person:" + System.lineSeparator() + toString());
		// toString override from SalesEmployee superclass using tester info
	} // closes voided method
} // closes class
