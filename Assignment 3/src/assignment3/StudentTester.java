/* Andrew Conway
 * Student ID: 08101179
 * CT 874: Programming 1
 * Question 2: Student
 */ 
package assignment3;

import java.util.ArrayList;
import java.util.List;
// bring in Java collections for lists and array lists.

class StudentTester {

	public static void main(String[] args) {
			
		List<Student> tester = new ArrayList<Student>( );
		// creates new Array List of Student class type
	
		tester.add(new Student("John Phillips", 12345678));
		tester.add(new Student("Sharon Swords", 23456789));
		// adds two new instances to the list tester
	
		System.out.println("Output Student List");
		// outputs text before for enhanced for loop is initiated
		
		for (Student z : tester) {
			System.out.println(z.toString() + "]");
			// enhanced for loop - stating student z is of the list named tester & prints out 
			// according to the criteria of the toString set out in the Student class
		} // end loop
		
		tester.remove(1);
		// removes the second student from the tester list
		
		for (Student x : tester) 	{
			System.out.println("Output Student List  -  After Removal" + System.lineSeparator() + x.toString() + "]");
			// Prints out the student list after the second student has been removed
		/* ***alt method for same process*** for (Student y : tester) {
		* System.out.println("Student [ name = " + y.getName() + ", IDnumber =  " + y.getIDnumber() + "]"); }
		*/ 	
		} //end loop
	} // end method
} // end class