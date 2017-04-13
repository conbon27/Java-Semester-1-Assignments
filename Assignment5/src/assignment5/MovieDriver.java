package assignment5;

import java.util.Scanner;
//imports java utility for scanner so inputs can be read.
public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q2Movie[] movie = new Q2Movie[3];
		// creates array of class type Q2Movie of size 3
		Scanner string_input = new Scanner(System.in);
		// creates scanner input for type string
		Scanner int_input = new Scanner(System.in);
		// creates scanner input for type int		
		for (int i =0; i<3; i++) 
		{
			// for every integer less than 3, increment & following:
			Q2Movie film = new Q2Movie();
			// object film is instantiated as a new type Q2Movie
			System.out.println("Please enter the title of movie " +(i+1) + ": ");
			film.settitle(string_input.nextLine());
			System.out.println("Please enter the genre of movie " +(i+1) + ": ");
			film.setgenre(string_input.nextLine());
			System.out.println("Please enter the rating (1-5) for movie " +(i+1) + ": ");
			film.setrating(int_input.nextInt());
			// prints out a request to user to enter in info for title, genre & rating
			// user input is linked to each of the setters above for title, genre & rating
			movie[i]= film;
		} // data added to the film object added to the array movie
		
		for (int z=0; z<movie.length; z++)
		{
			// for loop for int z that exists less than the size of array movie,
			Q2Movie film = movie[z];
			// object film of type Q2Movie is in array movie - as above in reverse
			System.out.println("Movie " + (z+1) + " Title: " + film.gettitle());
			System.out.println("Movie " + (z+1) + " Genre: " + film.getgenre());
			System.out.println("Movie " + (z+1) + " Rating: " + film.getrating());
			// Prints out the information that has been inputting by user using getters
			movie[z].playIt();
			// calls playIt method with the last movie listed with the getter
	string_input.close();	
	int_input.close();
	// closes scanners in class
		} 
	} // closes method
} // closes class
