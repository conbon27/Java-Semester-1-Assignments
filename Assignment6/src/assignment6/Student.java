/** Andrew Conway
 * S ID: 08101179
 * CT 874: Programming 1
 * Question 1: Student
 */
package assignment6;

public abstract class Student {
	private String name;
	private long id;
	private String grade;
	private int[] test;
	private static final int NUM_TESTS = 3;
	// creates & sets variables to private
	// can only be accessed within class & through public accessors.
	// array test is set to size 3
	// NUM_TESTS is set as static final so cannot be overridden in subclasses

	public Student() {
		this("No Name", 000);
		// default constructor for Student name, id & grade
	}

	public Student(String name, long id) {
		this.name = name;
		this.id = id;
		this.grade = "x";
		this.test = new int [3];
		// public constructor with values for abstract class student
	}

	public void setName(String name) {
		this.name = name;
	} // setter for private string variable name

	public void setID(long id) {
		this.id = id;
	} // setter for private long variable id

	public void setGrade(String grade) {
		this.grade = grade;
	} // setter for private string variable grade

	public void setTestScore(int indexLocation, int score){
		this.test[indexLocation] = score;
	} // setter for private array test - sets indexlocation as one int and the actual value within the integer as the other

	public int getTestScore(int score) {
		return this.test[score];
	} // getter which returns the value within the array test.

	public int getNumTest() {
		return NUM_TESTS;
	} // getter for the private final variable NUM_TESTs - privately set at 3

	public String getName() {
		return name;
	} // public getter for string name

	public long getID() {
		return id;
	} // public getter for long ID

	public String getGrade() {
		return grade;
	} // public getter for string grade

	public String toString() {
		return "Student is " + getName() + "." + System.lineSeparator() + "ID is " + getID() + "."
				+ System.lineSeparator() + "Result is " + getGrade();
		// toString constructor overridden to produce the above string + data to
		// be entered from above accessors.
	}
	public abstract void calculateResult();
	// abstract method which must be overridden in sub-concrete classes
	// as abstract, no method required here.
} // closes class