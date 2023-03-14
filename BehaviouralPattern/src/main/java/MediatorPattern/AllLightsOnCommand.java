package MediatorPattern;

public class AllLightsOnCommand implements Command {

	private Mediator mediator;
	
	public AllLightsOnCommand(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void execute() {
		// TODO Auto-generated method stub
		this.mediator.onAllLights();
	}
	
}
