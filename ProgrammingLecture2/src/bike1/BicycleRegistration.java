package bike1;

public class BicycleRegistration {
public static void main (String [] args) {
	String owner1, owner2; //Declare string variables
	Bicycle bike1 = new Bicycle ( ); //Declare and Create Bicycle object
			bike1.setOwnerName("Sally");//assign value to bike1 (object.method)
	Bicycle bike2 = new Bicycle ( );
			bike2.setOwnerName("Harry");
	//output info on two bike's owners
	owner1 = bike1.getOwnerName(); // gets values for bike2 (dot notation)
	owner2 = bike2.getOwnerName();
	System.out.println(owner1 + " has a banana.");
	System.out.println(owner2 + " has a George.");
}
}
