package behavioral.strategy.everydaydemo;

public class Person {
	
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

}
