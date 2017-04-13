/** Andrew Conway
 * S ID: 08101179
 * CT 874: Programming 1
 * Question 1: SalesEmployee
 */
package assignment7;

import java.text.DecimalFormat;

//select & bring in the decimal format text so decimal places can be set
public abstract class SalesEmployee {
	// abstract class declared
	private String firstName;
	private String lastName;
	@SuppressWarnings("unused") // warnings suppressed
	private static int bikeEmployeeNumber;
	private String ppsNumber;
	protected double sales;
	protected double commission;
	private int employeeNumber;
	// private & protected variables declared

	public SalesEmployee() {
		this("Not Given", "N/A", "0000000A");
		// default constructor for SalesEmployee
	}

	public SalesEmployee(String firstName, String lastName, String ppsNumber) {
		// public constructors for the following private/protected:
		this.firstName = firstName;
		this.lastName = lastName;
		this.commission = 00;
		this.ppsNumber = "0000000A";
		this.sales = 00;
		this.employeeNumber = 0;
	}

	// public setters for the private/protected variables below:
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPPS(String ppsNumber) {
		this.ppsNumber = ppsNumber;
	}

	// public getters for the private/protected variables below:
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPPS() {
		return ppsNumber;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	DecimalFormat df = new DecimalFormat("0");
	// activating the decimal format and setting it to 0 places

	// public toString accessor set up that must be overridden.
	@Override
	public String toString() {
		return ("Name: " + getFirstName() + " " + getLastName() + System.lineSeparator() + "PPS No: " + getPPS()
				+ System.lineSeparator() + "Total value of each Sale: €" + df.format(sales) + System.lineSeparator()
				+ "Commission: €" + df.format(commission));
	} // closes toString
		// toString constructor overridden to produce the above string + data to
		// be entered from above accessors.

	public abstract void calculateCommission();
	// abstract method which must be overridden in sub-concrete classes
	// as abstract, no method required here.

} // closes class
