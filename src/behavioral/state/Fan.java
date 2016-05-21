package behavioral.state;

public class Fan {
	
	private State fanOffState;
	private State fanLowState;
	private State fanMedState;
	private State fanHighState;
	
	State state;
	
	public Fan() { 
		// init states options
		fanOffState		= new FanOffState(this);
		fanLowState		= new FanLowState(this);
		fanMedState		= new FanMedState(this);
		fanHighState	= new FanHighState(this);
		
		// init object state
		state = fanOffState;
	}
	
	public void pullChain() {
		state.handleRequest();
	}
	
	public String toString() {
		return state.toString();
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public State getFanOffState() {
		return fanOffState;
	}
	
	public State getFanLowState() {
		return fanLowState;
	}
	
	public State getFanMedState() {
		return fanMedState;
	}

	public State getFanHighState() {
		return fanHighState;
	}
	
}
