package behavioral.command.levo;

public class CommandCustomDemo {

	public static void main(String[] args) {
		Light light = new Light();
		Switch lightSwitch = new Switch();
		
		Command onCommand = new OnCommand(light);
		Command offCommand = new OffCommand(light);
		
		lightSwitch.setCommand(offCommand);
		lightSwitch.executeCommand();
		
		lightSwitch.setCommand(onCommand);
		lightSwitch.executeCommand();
		
		lightSwitch.executeCommand();
		
		lightSwitch.setCommand(offCommand);
		lightSwitch.executeCommand();
	}

}
