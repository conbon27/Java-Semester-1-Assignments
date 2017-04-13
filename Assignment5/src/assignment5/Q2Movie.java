/* Andrew Conway
 * Student ID: 08101179
 * CT 874: Programming 1
 * Question 2: Private Movie
 */
package assignment5;

class Q2Movie {

	private String title;
	private String genre;
	private int rating;
	// setting the above variables to private
	
	public void playIt()
	{
		System.out.println(gettitle() + " - Now Playing");
	} // method which prints the above text & accessed film title when called
	public Q2Movie() {
		this("No Name", "No genre", 00);
	} // default public constructor & values for the class

	public Q2Movie(String title, String genre, int rating) {
		this.title = title;
		this.genre = genre;
		this.rating = rating;
	} // public constructor set within the above parameters

	public String gettitle() {
		return title;
	} // public getter set for the string name - i.e. calling gettitle returns
		// name of film

	public String getgenre() {
		return genre;
	} // public getter set for the int id - i.e. calling getgenre returns genre
		// of film

	public int getrating() {
		return rating;
	} // public getter set for the string course - i.e. calling getrating
		// returns rating of film

	public void settitle(String title) {
		this.title = title;
	} // public setter to set the name of a film

	public void setgenre(String genre) {
		this.genre = genre;
	} // public setter to set the genre of a film

	public void setrating(int rating) {
		this.rating = rating;
	} // public setter to set the rating of a film
} // closes class
