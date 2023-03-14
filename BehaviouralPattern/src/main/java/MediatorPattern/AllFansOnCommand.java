package MediatorPattern;

public class AllFansOnCommand implements Command {
	
private Mediator mediator;
	
	public AllFansOnCommand(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void execute() {
		// TODO Auto-generated method stub
		this.mediator.onAllFans();
	}

}
