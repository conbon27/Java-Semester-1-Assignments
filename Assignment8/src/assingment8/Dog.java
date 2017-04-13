package assingment8;

public class Dog extends Animal {
	// extends superclass Animal
	public Dog() {
		// public constructor for subclass dog
	}

	@Override
	public String sound() {
		// brings in sound to be overridden as first concrete subclass
		return "bark bark ruff";
	} // closes sound method

	public String fetch(String item) {
		return getName() + " fetches " + item;
		// when called returns name of particular animal & text.
	} // closes fetch method

	@Override
	public String toString() {
		return fetch("rock") + System.lineSeparator() + getName() + " says " + sound();
	} // toString method overridden from superclass -to be called in tester
} // closes class
