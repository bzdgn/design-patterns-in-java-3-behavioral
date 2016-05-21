package behavioral.command.levo;

public class OffCommand extends AbstractCommand {

	public OffCommand(Light light) {
		super(light);
	}

	@Override
	public void execute() {
		super.light.off();
	}

}
