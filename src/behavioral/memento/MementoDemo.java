package behavioral.memento;

public class MementoDemo {

	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		
		Employee emp = new Employee();
		
		emp.setName("John Dick");
		emp.setAddress("111 Main Street");
		emp.setPhone("888-555-1212");
		
		System.out.println("Employee before save:        " + emp);
		
		// savepoint #1
		caretaker.save(emp);
		
		emp.setPhone("444-555-6666");
		
		// savepoint #2
		caretaker.save(emp);
		
		System.out.println("Employee after change:       " + emp);
		
		emp.setPhone("333-999-6666"); // <-- we haven't called save!
		
		System.out.println("Employee after change:       " + emp);
		System.out.println("******************************");
		
		caretaker.revert(emp);
		
		System.out.println("Reverts to last save point : " + emp);
		
		caretaker.revert(emp);
		
		System.out.println("Reverts to original        : " + emp);
	}

}
