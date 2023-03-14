package ObserverPattern;

public class TabClient implements Observer {

	
	private Subject subject;
	
	public TabClient(Subject subject) {
		this.subject = subject;
		subject.append(this);
	}
	
	public void addMessage(String message) {
		subject.setState(message + " from Tab Client");
	}
	
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Tab Client: "+ subject.getState());
	}

}