package assignment6;

import java.util.Scanner;
// import utility scanner to allow for the creation of user inputs

public class Client {

	public static void main(String[] args) {

		Student[] pupil = new Student[3];
		// creates array of class type Student of size 3
		Scanner string_input = new Scanner(System.in);
		Scanner int_input = new Scanner(System.in);
		Scanner long_input = new Scanner(System.in);
		// creates new scanner inputs for each data type needed in class

		for (int x = 0; x < 2; x++) {
			// for loop stating for 2 instances, create a new instance of
			// Undergrad in the first & second positions in array pupil with
			// user prompts to populate the data
			// with name & ID number
			pupil[x] = new UnderGrad();
			System.out.println("Please enter name of UnderGrad Student:");
			pupil[x].setName(string_input.nextLine());
			System.out.println("Please enter ID number: ");
			pupil[x].setID(long_input.nextLong());
			for (int w = 0; w < 3; w++) {
				// for loop within to enter 3 test score into the array
				System.out.println("Please enter test score: ");
				pupil[x].setTestScore(w, int_input.nextInt());
				// user input is linked to each of the setters above for name,
				// ID & score
			} // closes second for loop
		} // closes for loop

		pupil[2] = new PostGrad();
		// creates a new instance of class PostGrad at the 3rd position in the
		// array pupil
		System.out.println("Please enter name of PostGrad Student: ");
		pupil[2].setName(string_input.nextLine());
		System.out.println("Please enter ID number: ");
		pupil[2].setID(long_input.nextLong());
		// prints out a request to user to enter in info for name, ID & test
		// score
		// user input is linked to each of the setters above for name, ID &
		// score
		// No for loop used as only 1 user input required

		for (int p = 0; p < 3; p++) {
			// for loop within to enter 3 test score into the array
			System.out.println("Please enter test score: ");
			pupil[2].setTestScore(p, int_input.nextInt());

			// user input is linked to each of the setters above for name,
			// ID & score
		} // closes for loop

		for (int q = 0; q < pupil.length; q++) {
			pupil[q].calculateResult();
			// for loop which states for every instance in the array pupil
			// run calculateResult method from PostGrad/UnderGrad classes
		} // closes for loop
		string_input.close();
		int_input.close();
		long_input.close();
		// close scanner inputs to prevent further user input

	}// closes main method
} // closes class