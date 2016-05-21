package behavioral.strategy.everydaydemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyEverydayDemo {

	public static void main(String[] args) {
		Person bryan = new Person(39, "Bryan", "888-555-4444");
		Person mark = new Person(41, "Mark", "888-555-3333");
		Person chris = new Person(38, "Chris", "801-222-5151");
		
		List<Person> people = new ArrayList<Person>();
		people.add(bryan);
		people.add(mark);
		people.add(chris);
		
		System.out.println("Not sorted");
		printContents(people);
		
		// sort by age
		
		// Anonymous class inside
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if(o1.getAge() < o2.getAge())
					return -1;
				else if(o1.getAge() > o2.getAge())
					return 1;
				else
					return 0;
			}
			
		});
		
		System.out.println("\nSorted by age");
		printContents(people);
		
		// sort by name
		
		// Anonymous class inside
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		System.out.println("\nSorted by name");
		printContents(people);
	}
	
	private static void printContents(List<Person> people) {
		for(Person person : people)
			System.out.println(person.getName());
	}

}
