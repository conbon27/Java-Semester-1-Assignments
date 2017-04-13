package ifsandElses;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gradeLevel;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your year ");
		gradeLevel = scanner.nextInt();
		
		switch (gradeLevel) {
		
		case 1: System.out.print("Go to It125");
		break;
		case 2: System.out.print("Go to the Cairns");
		break;
		default: System.out.print("Input error: Invalid Data");
		break;
		}
	}

}
