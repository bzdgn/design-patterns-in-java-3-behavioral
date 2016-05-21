package behavioral.command.levo;

public class OnCommand extends AbstractCommand {

	public OnCommand(Light light) {
		super(light);
	}

	@Override
	public void execute() {
		super.light.on();
	}

}
