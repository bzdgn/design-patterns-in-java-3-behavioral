package behavioral.observer;

public class PhoneClient extends Observer {
	
	public PhoneClient(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	public void addMessage(String message) {
		subject.setState(message + " - sent from phone");
	}
	
	@Override
	public void update() {
		System.out.println("Phone Stream: " + subject.getState());
	}
	
}
