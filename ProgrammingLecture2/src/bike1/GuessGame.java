package bike1;

public class GuessGame {
	//Create 3 instance variables for the 3 player objects
	Player p1;
	Player p2;
	Player p3;
	
public void startGame() {
	//Create 3 player objects & assign them to the 3 player instance variables
	p1 = new Player();
	p2 = new Player();
	p3 = new Player();
	//Declare 3 variables to hold a player's guesses
	int guessp1 = 0;
	int guessp2 = 0;
	int guessp3 = 0;
	//Declare 3 variables to hold a true/false based on a player's answer
	boolean p1isright = false;
	boolean p2isright = false;
	boolean p3isright = false;
	
	//Generate the number the players have to guess
	int targetNumber = (int) (Math.random() * 10);
	
	System.out.println("I'm thinking of a number between 0 and 9 ...");
	
	while(true) {
			System.out.println("Number to guess is " + targetNumber);
		
	//Call each player's guess() method
		p1.guess();
		p2.guess();
		p3.guess();
		
	//assign p1's number (the result of guess()) to guess
	//variable by accessing the number variable of each player
		
		guessp1 = p1.number;
		System.out.println("Player one guesses " + guessp1);
		
		guessp2 = p2.number;
		System.out.println("Player two guesses " + guessp2);
		
		guessp3 = p3.number;
		System.out.println("Player three guesses " + guessp3);
		
	//if player's guess matches targetNumber set variable to true
		if (guessp1 == targetNumber) { p1isright = true;}
		if (guessp2 == targetNumber) { p2isright = true;}
		if (guessp3 == targetNumber) { p3isright = true;}
		
	//if player one or player two or player three is correct (|| operator means OR)
		if ( p1isright || p2isright || p3isright ) {
			System.out.println("We have a winner!");
			System.out.println("Player one got it right? " + p1isright);
			System.out.println("Player two got it right? " + p2isright);
			System.out.println("Player three got it right? " + p3isright);
			System.out.println("Game is over");
			break; //game over, break out of loop
		}
		else {
				//stay in loop and keep playing, nobody guessed correctly
				System.out.println("Players will have to try again.");
			}
		} // end loop					
}//end method
}//end class
