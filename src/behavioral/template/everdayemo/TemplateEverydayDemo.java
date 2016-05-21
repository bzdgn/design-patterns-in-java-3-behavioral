package behavioral.template.everdayemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TemplateEverydayDemo {

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
		
		Collections.sort(people);
		
		System.out.println("\nSorted by name");
		printContents(people);
	}
	
	private static void printContents(List<Person> people) {
		for(Person person : people)
			System.out.println(person.getName());
	}

}
