package behavioral.state;

public class StateDemo {

	public static void main(String[] args) {
		Fan fan = new Fan();
		
		// state = OFF
		System.out.println(fan);
		
		// state -> LOW
		fan.pullChain();
		
		// state = LOW
		System.out.println(fan);
		
		// state -> MED
		fan.pullChain();
		
		// state = MED
		System.out.println(fan);
		
		// state -> HIGH
		fan.pullChain();
		
		// state = HIGH
		System.out.println(fan);
		
		// state -> OFF
		fan.pullChain();
		
		// state = OFF
		System.out.println(fan);
		
	}

}
