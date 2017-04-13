/* Andrew Conway 
 * ID: 08101179 
 * CT 874: Programming 1  
 */
package assignment3;

import java.util.List;
import java.util.ArrayList;
// import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
// imports java utility for arrays, lists, array & linked lists & list iterator.

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> stuff = new ArrayList<Integer>();
		// Creates new array list with parameters from array 'stuff'

		for (int i = 0; i < 4; i++) {
			// for loop which states for integer i that is less than, the
			// following happens
			stuff.add((int) (Math.random() * 10));
			// adds a random number which is cast as an integer to the array
			// "stuff"
			// example of auto-boxing here above
		} // closes loop
		System.out.println("Contents of the array list 'stuff' are: ");
		// prints text ahead of enhanced for loop condition
		for (Integer z : stuff) {
			// enhanced for loop condition stating for every z integer in stuff
			System.out.println(z);
		} // closes loop

		stuff.remove(3);
		// removes the forth place of the stuff index

		ListIterator<Integer> itr = stuff.listIterator();
		// brings in the list iterator to cycle through the array list
		System.out.println("Following removal, Array list iterator outputs: ");
		// prints text ahead of enhanced while loop
		while (itr.hasNext()) {
			// while loop to say that while there is another element to iterate
			System.out.println(itr.next());
			// print out the contents of the list
		} // closes while loop
		List<Integer> stuffing = new LinkedList<Integer>();
		// generates new linked list
		// alt can use for conversion:
		// LinkedList stuffing = new LinkedList(Arrays.asList(stuff));
		// uses java util.array to convert array list to linked list
		System.out.println("The linked list is: " + stuffing);
		// print to check that linked list runs correctly

		for (int j = 0; j < 3; j++) {
			// for loop which states for integer j that is less than, the
			// following happens
			stuffing.add((int) (Math.random() * 10));
			// adds a random number which is cast as an integer to the array
			// "stuffing"
			// example of auto-boxing here above
		} // closes loop
		System.out.println("Contents of the linked list 'stuffing' are now: ");
		// prints text ahead of enhanced for loop condition
		for (Integer x : stuffing) {
			// enhanced for loop condition stating for every x integer in
			// stuffing
			System.out.println(x);
		} // closes loop

		stuffing.remove(2);
		// removes the third place of the index of stuffing

		ListIterator<Integer> itr1 = stuffing.listIterator();
		// brings in the list iterator to cycle through the array list
		System.out.println("Following removal, linked list iterator outputs: ");
		// prints text ahead of while loop condition
		while (itr1.hasNext()) {
			// while loop to say that while there is another element to iterate
			System.out.println(itr1.next());
			// print out the contents of the list
		} // closes while loop
	} // closes main method
} // closes class