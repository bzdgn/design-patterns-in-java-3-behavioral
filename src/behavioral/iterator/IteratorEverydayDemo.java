package behavioral.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorEverydayDemo {

	public static void main(String[] args) {
//		List<String> names = new ArrayList<>();
		Set<String> names = new HashSet<>();
		
		names.add("Bryan");
		names.add("Aaron");
		names.add("Jason");
		
		System.out.println("Names size: " + names.size());
		
		// using built-in iterator
		for (String name : names) {
			System.out.println(name);
		}
		
//		//traditional not working for Set
//		for(int i = 0; i < names.size(); i++) {
//			System.out.println(names.get(i));
//		}
		
//		Iterator<String> namesItr = names.iterator();
//		
//		while(namesItr.hasNext()) {
//			String name = namesItr.next();
//			System.out.println(name);
//			namesItr.remove();
//		}
		
		System.out.println("Names size: " + names.size());
	}

}
