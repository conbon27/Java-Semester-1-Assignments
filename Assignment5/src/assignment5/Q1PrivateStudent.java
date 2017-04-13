/* Andrew Conway
 * Student ID: 08101179
 * CT 874: Programming 1
 * Question 1: Private Student
 */
package assignment5;

class Q1PrivateStudent {

	private String name;
	private int id;
	private String course;
	// set the above instance variables to private - can only be accessed within
	// class & through public accessors.

	public Q1PrivateStudent() {
		this("No Name", 000, "Not Set");
	} // default public constructor & values for the class

	public Q1PrivateStudent(String name, int id, String course) {
		this.name = name;
		this.id = id;
		this.course = course;
	} // public constructor set within these parameters

	public String getname() {
		return name;
	} // public getter set for the string name - i.e. calling getname returns
		// name of student

	public int getid() {
		return id;
	} // public getter set for the int id - i.e. calling getid returns id number
		// of student

	public String getcourse() {
		return course;
	} // public getter set for the string course - i.e. calling getcourse
		// returns course of student

	public void setname(String name) {
		this.name = name;
	} // public setter to set the name of a student

	public void setid(int id) {
		this.id = id;
	} // public setter to set the id number of a student

	public void setcourse(String course) {
		this.course = course;
	} // public setter to set the course of a student

	public String toString() {
		return "Student's name is " + getname() + "." + System.lineSeparator() + "Their Student ID number is " 
				+ getid() + " while their course is "+ getcourse() + System.lineSeparator();
	}// toString constructor overridden to produce the above string + data to be entered.

} // closes class
