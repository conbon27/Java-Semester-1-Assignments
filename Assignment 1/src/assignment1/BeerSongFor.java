package assignment1;

public class BeerSongFor { // class naming

	public static void main(String[] args) {
		
		String word = "bottles";
		// integer and string for the class stated
				
		for (int beerNum = 99; beerNum >= 1;)  {
			// for statement initializing the variable and further parameters of the statement.
			// -- is a decrement so will reduce between the limits set in the "for" parenthesis. 
	
			
			System.out.println(beerNum + " " + word + " of beer on the wall");
			// " " means a space between print out
			System.out.println(beerNum + " " + word + " of beer");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			// prints out the song in the format listed with a space & the word set for a particular number.
			beerNum = beerNum -1;
			// instructs number to print out and decrease with every loop that is run
			
			if (beerNum == 1) {
				word = "bottle";
			} 	 // ensuring that the singular word "bottle" is correctly used for the final beer on the wall.

			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall");
			}
			else { // what will happen when the parameters of the For are no longer met, loop will be broken and this displayed
				System.out.println("No more bottles of beer on the wall");
			}
		} //end loop
	} // end main method
}  // end class
