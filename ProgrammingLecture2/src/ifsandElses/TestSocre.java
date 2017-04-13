package ifsandElses;

import java.util.Scanner;

public class TestSocre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int examResult; //declare variable
		Scanner input  = new Scanner(System.in); // create Scanner object
		
		System.out.print("Enter your Exam Result: ");
		examResult = input.nextInt();
			
			if (examResult >= 40){
				System.out.println("Congratulations you have passed");
			}
			else {
				System.out.println("Unfortunately you have failed");
			}
	}//end method
}//end class
