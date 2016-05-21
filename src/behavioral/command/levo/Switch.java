package behavioral.command.levo;

public class Switch {
	
	private Command command;
	
	public Switch(Command command) {
		setCommand(command);
	}
	
	public Switch() {} 
	
	public void executeCommand() {
		command.execute();
	}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
}
