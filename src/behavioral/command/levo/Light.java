package behavioral.command.levo;

public class Light implements LightSwitch {
	
	private boolean state;
	
	public Light() {
		this.state = false;
	}
	
	@Override
	public void on() {
		if(this.state == false) {
			this.state = true;
			System.out.println("Light::state::ON");
		}
		else
			System.out.println("Light::ERROR::State is already 'ON'");
	}

	@Override
	public void off() {
		if(this.state == true) {
			this.state = false;
			System.out.println("Light::state::OFF");
		}
		else
			System.out.println("Light::ERROR::State is already 'OFF'");
	}

}
