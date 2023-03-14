package CommandPattern;


//Invoker
public class Switch {
	
	public void executeCommand(Command command) {
		command.execute();
	}

}
