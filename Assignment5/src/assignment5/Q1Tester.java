package assignment5;

import java.util.ArrayList;

public class Q1Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Q1PrivateStudent> test = new ArrayList<Q1PrivateStudent>();
		// creates new array list of type Q1PrivateStudent
	
		test.add(new Q1PrivateStudent("Nick Scarpino", 101, "Finance"));
		test.add(new Q1PrivateStudent("Greg Miller", 102, "English"));
		test.add(new Q1PrivateStudent("Colin Moriarty", 103, "History"));
		// creates 3 instances of the class Q1PrivateStudent in the array test
	
		System.out.println("Student Listing:" + System.lineSeparator() + test);
		// check print to ensure that the above instances have been added to the array in the correct format.
		// toString used.
		Q1PrivateStudent one = new Q1PrivateStudent();
			one.getname();
			one.getid();
			one.getcourse();
			// using getters to add details of a new student in the Q1PrivateStudent class
			test.add(one);
			// adds instance one to the array list test
		System.out.println("Default getter for " + one);
		//	check print to to see that the instance one has been assigned with the default getters
		Q1PrivateStudent two = new Q1PrivateStudent();	
			two.setname("Kevin Coello");
			two.setid(104);
			two.setcourse("Biology");
			// using setters to add details of a new student in the Q1PrivateStudent class
			test.add(two);
			// adds instance two to the array list test
		System.out.println("Example of setter: " + two);
		// check print to check that the instance two has been assigned with the correct setters
		System.out.println(test);
	} // end method

} // end class
