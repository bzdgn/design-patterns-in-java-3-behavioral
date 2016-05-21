package behavioral.template.everdayemo;

public class Person implements Comparable<Person> {
	
	private int age;
	private String name;
	private String phoneNumber;
	
	public Person() { }
	
	public Person(int age, String name, String phoneNumber) {
		this.age = age;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public int compareTo(Person o) {
		if(this.getAge() > o.getAge())
			return 1;
		else if(this.getAge() < o.getAge())
			return -1;
		else
			return 0;
	}

}
