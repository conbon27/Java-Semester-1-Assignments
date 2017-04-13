package variables;

public class BookTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b = new Book();
		Book c = new Book();
		Book d = c;
		
		b.setTitle("Head First Java");
		c.setTitle("Thinking in Java");
		
		System.out.println("Title of b is " +b.getTitle());
		System.out.println("Title of c is " +c.getTitle());
		System.out.println("Title of d is " +d.getTitle());
		
		c = b; // sets c = b so now changes the title to head first java as it is a copy. D does not change and is still Thinking in Java
		System.out.println("Title of c is now " + c.getTitle());
		System.out.println("TItle of d is now " +d.getTitle());
		
		c = null;
		System.out.println("Title of c is " + c.getTitle());
		// Throws a java.lang.NullPointerException

	}

}
