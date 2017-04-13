package collections;

class Person {

	//Data members
	private String name; 	// name of person
	private int age;		//age of person
	private char gender;	//gender of person

	// default constructor 
	public Person() {
		this("Not Given", 0, 'U');
	}
	// Constructs a new Person with passed name, age and gender.
	// Illustrates explicit use of this.
	public Person(String name, int age, char gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	
	public int getAge( ) {
		return age;
	}
	public char getGender ( ) {
		return gender;
	}
	public String getName ( ) {
		return name;
	}
	public void setAge( int age ) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setName (String name) {
		this.name = name;
	}
	
	// Override toString ()
	public String toString() {
		return getName() + " " + getAge() + " " + getGender();
	}
	
	} // end class