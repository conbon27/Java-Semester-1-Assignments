package assingment8;

// import file input/output utilities
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class AnimalTester {

	public static void main(String[] args) {

		Dog dog1 = new Dog();
		dog1.setName("Toby");
		// new instantiation of dog class with values
		Dog dog2 = new Dog();
		dog2.setName("Vic");
		// new instantiation of dog class with values
		Cat cat1 = new Cat();
		cat1.setName("Chaz");
		// new instantiation of cat class with values
		Cat cat2 = new Cat();
		cat2.setName("Ed");
		// new instantiation of cat class with values
		Animal[] pets = new Animal[4];
		// Creates new Array from superclass
		pets[0] = (dog1);
		pets[1] = (dog2);
		pets[2] = (cat1);
		pets[3] = (cat2);
		// new assignment of dog & cat class in array list pets

		System.out.println(Arrays.toString(pets));
		// prints out array list pets
		try {
			// create a connection stream (write bytes)
			FileOutputStream fileStream = new FileOutputStream("AnimalInfo.dat");
			// create a chain stream (allows objects to be written to a stream)
			ObjectOutputStream os = new ObjectOutputStream(fileStream);
			// call writeObject() on the Object stream
			os.writeObject(pets);
			// write pets to file
			os.close();
			// closes tool
		} // closes try
		catch (Exception e) {
			e.printStackTrace();
			// catches & prints any error
		} // closes catch

		try {
			FileInputStream fileStream = new FileInputStream("AnimalInfo.dat");
			// recreates a connection stream
			ObjectInputStream os = new ObjectInputStream(fileStream);
			// allows objects to be read from a stream
			Animal[] ani = (Animal[]) os.readObject();
			// creates new array of array type Animal & reads in data
			for (Animal element : ani) {
				System.out.println(element.toString());
				// prints out content of new array = pre-serialized
			}

			os.close();
			// closes tool
		} catch (Exception e) {
			e.printStackTrace();
			// catches & prints any error
		} // closes catch
	} // closes main method
} // closes class
