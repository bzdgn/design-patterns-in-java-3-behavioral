package behavioral.command;

// client
public class CommandDemo {

	public static void main(String[] args) {
		Light light = new Light();
		Switch lightSwitch = new Switch();
		
		Command onCommand = new OnCommand(light);
		Command offCommand = new OffCommand(light);
		
		lightSwitch.storeAndExecute(onCommand);
		lightSwitch.storeAndExecute(offCommand);
	}

}
