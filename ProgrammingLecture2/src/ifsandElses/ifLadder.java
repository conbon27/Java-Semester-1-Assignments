package ifsandElses;

public class ifLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int marks = 76;
		String grade = "";
		
			if (marks >= 70 && marks <= 100) {
				grade = "First Class Honours";
			} else if (marks >= 60 && marks < 70) {
				grade = "2.1";
			}
			System.out.println("Grade = " + grade);
			
	}
}
