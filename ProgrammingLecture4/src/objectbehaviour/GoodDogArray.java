package objectbehaviour;

public class GoodDogArray {

	public static void main(String[] args) {

				//declare & create Dog array
				GoodDog[] pets = new GoodDog[7];
				
				//create two new objects and assign them to the first two array elements
				pets[0] = new GoodDog();
				pets[1] = new GoodDog();
				
				// Call the methods on the two GoodDog objects
				pets[0].setSize(30);
				System.out.println("Size of pet[0] = " + pets[0].getSize());
				
				pets[1].setSize(10);
				System.out.println("Size of pet[1] = " + pets[1].getSize());
	}//end method
}//end class
