/* Andrew Conway
 * Student ID: 08101179
 * CT 874: Programming 1
 * Question 2: Student
 */ 
package assignment3;

class Student {
		// data members
		private String name; 
		// name of student
		private long IDnumber;
		// student's ID number
		
		// default public constructor & values set	
		public Student() {
			this("Unknown", 0);
		}
		// next public constructor set with parameters below	
		public Student(String name, long IDnumber) {
			this.name = name;
			this.IDnumber = IDnumber;
		}
		public String toString() {
			return "Student [ name = " + getName() + ", IDnumber =  " + getIDnumber();
		} // toString constructor so accessing it for a variable in a method produces 
			// the above text + the getters selected
		public long getIDnumber () {
				return IDnumber;
		} // setting accessor for the student ID number to return the ID number
		public String getName () {
				return name;
		} // setting accessor for the student name to return the name of the student
		public void setIDnumber (long IDnumber) {
			this.IDnumber = IDnumber;
		} // setting accessor for setting the student number as a long variable
		public void setName (String name) {
			this.name = name;
		}// setting accessor for setting the student name as a string variable
} // end class