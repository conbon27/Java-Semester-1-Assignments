package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

class FriendsList {

	public static void main(String[] args) {
		
		List<Person> friends = new ArrayList<Person>( );	
		// List<Person> friends = new LinkedList<Person>( );
		
		friends.add(new Person("Jane", 10, 'F'));
		friends.add(new Person("Jack",  6, 'M'));
		friends.add(new Person("Jill",  8, 'F'));
		
		for (int i =0; i < friends.size(); i++) {
			System.out.println(friends.get(i).getName() + " " + friends.get(i).getAge() + " " + friends.get(i).getGender());
		}
		
		friends.remove(1); // Remove the second person
		
		
		for (Person p : friends) {
			System.out.println(p.toString()); // Overwrite toString()
		}	
	}
}
	
