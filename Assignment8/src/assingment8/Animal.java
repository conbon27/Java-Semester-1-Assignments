/** Andrew Conway
 * S ID: 08101179
 * CT 874: Programming 1
 * Question 1: Animal
 */
package assingment8;

import java.io.Serializable;

public abstract class Animal implements Serializable {
	// abstract class declared
	private String name;

	// private variable created

	public Animal() {
		this.name = "N/A";
	} // public constructor for animal

	public void setName(String name) {
		this.name = name;
	} // public setter for private variable 'name'

	public String getName() {
		return name;
	} // public getter to return private variable 'name'

	@Override
	public String toString() {
		return null;
	} // toString set in superclass to be overridden in concrete subclasses

	public abstract String sound();
	// public abstract variable sound created to be overridden in subclasses
} // closes abstract class
