package assingment8;

public class Cat extends Animal {
	// extends superclass Animal
	public Cat() {
		// public constructor for subclass dog
	}

	@Override
	public String sound() {
		// brings in sound to be overridden as first concrete subclass
		return "meow meow meow";
	} // closes sound method

	public String climb(String structure) {
		return getName() + " climbs " + structure;
		// when called returns name of particular animal & text
	} // closes fetch method

	@Override
	public String toString() {
		return climb("tree") + System.lineSeparator() + getName() + " says " + sound();
	} // toString method overridden from superclass -to be called in tester
} // closes class