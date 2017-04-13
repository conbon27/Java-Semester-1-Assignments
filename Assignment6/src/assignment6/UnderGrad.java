package assignment6;

public class UnderGrad extends Student {
	// this subclass extends the variables & methods from superclass Student

	public UnderGrad() {
		// default public constructor
	}

	public UnderGrad(String name, long id) {
		// public class constructor for extended variables
	}

	@Override
	public void calculateResult() {
		double sum = 0;
		// Initiates double sum
		for (int i = 0; i < getNumTest(); i++) {
			sum = sum + getTestScore(i);
		} // for loop for test results less than the number of tests, add them
			// to sum
		double average = sum / getNumTest();
		// average calculated by using the calculated sum divided by the
		// constant 3
		if (average >= 40) {
			// sets that if calculated average is above 50,
			// pass is set as grade
			setGrade("Pass.");
			System.out.println(toString());
		} // closes if
		else {
			setGrade("Fail.");
			// fail returned as grade if average is less than 50
			System.out.println(toString());
		} // closes else
	} // Override method from superclass Student
} // closes class
