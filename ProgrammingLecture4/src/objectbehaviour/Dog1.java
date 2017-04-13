package objectbehaviour;

class Dog1 {
	
	int size; // instance variable represents state
	
	// method represents behavior
	
	void bark() {
		
		if (size > 60) {
			System.out.println("Woof! Woof!");
		}
		else if (size > 14) {
			System.out.println("Ruff! Ruff!");
		}
		else {
			System.out.println("Yip! Yip!");
		}//end loop
	}//end method
}//end class
