package ObserverPattern;

public class LaptopClient implements Observer {

	
	private Subject subject;
	
	public LaptopClient(Subject subject) {
		this.subject = subject;
		subject.append(this);
	}
	
	public void addMessage(String message) {
		subject.setState(message + " from Laptop Client");
	}
	
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Laptop Client: "+ subject.getState());
	}

}
