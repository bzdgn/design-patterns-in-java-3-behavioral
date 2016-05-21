package behavioral.state.badexample;

public class Fan {
	
	private final static int OFF = 0;
	private final static int LOW = 1;
	private final static int MED = 2;
	
	private int state = OFF;
	
	public Fan() { }
	
	public void pullChain() {
		String pre = "pullChain():";
		if(state == OFF) {
			System.out.println(pre + " Turning fan on to low.");
			state = LOW;
		} else if (state == LOW) {
			System.out.println(pre + " Turning fan on to med.");
			state = MED;
		} else if (state == MED) {
			System.out.println(pre + " Turning fan on to off.");
			state = OFF;
		}
	}
	
	public String toString() {
		if(state == OFF) {
			return "Fan is off";
		} else if (state == LOW) {
			return "Fan is on low";
		} else if (state == MED) {
			return "Fan is on med";
		}
		
		return "Invalid state.";
	}
	
}
