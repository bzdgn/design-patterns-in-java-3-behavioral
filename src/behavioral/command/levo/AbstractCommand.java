package behavioral.command.levo;

public abstract class AbstractCommand implements Command {
	
	protected Light light;
	
	public AbstractCommand(Light light) {
		this.light = light;
	}
	
}
