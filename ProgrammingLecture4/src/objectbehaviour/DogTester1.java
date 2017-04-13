package objectbehaviour;

public class DogTester1 {

	public static void main(String[] args) {

		Dog1 rex = new Dog1(); // construct new instance variable "rex" based on the object class Dog1
		rex.size=70;
		
		Dog1 fido = new Dog1();
		fido.size=8;
		
		Dog1 spot = new Dog1();
		spot.size=35;
		
		rex.bark();
		fido.bark();
		spot.bark();
	} //end method
} // end class
