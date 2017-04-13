package assignment1;

public class BeerSongWhile {

	public static void main(String[] args) {
		
		int beerNum = 99;
		String word = "bottles";
				
		while (beerNum >= 1) {
	
			if (beerNum == 1) {
				word = "bottle";
			}
			
			System.out.println(beerNum + " " + word + " of beer on the wall");
			// " " means a space between print out
			System.out.println(beerNum + " " + word + " of beer");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			
			beerNum = beerNum -1;
			
			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall");
			}
			else {
				System.out.println("No more bottles of beer on the wall");
			}
		} //end loop
	} // end main method
}  // end class