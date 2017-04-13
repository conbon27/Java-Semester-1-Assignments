package variables;

public class Book {

	// instance variable (private)
	private String title;
	
	//constructor - creates a new object
	public Book(){
		title = "unassigned";
	}
	
	// methods (public getters & setters - sets what you would type to recall or set variables)
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String t){
		title = t;
	}
}
