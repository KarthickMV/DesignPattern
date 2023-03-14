package ObserverPattern;

import ObserverPattern.Observer;

public class PhoneClient implements Observer {

	
	private Subject subject;
	
	public PhoneClient(Subject subject) {
		this.subject = subject;
		subject.append(this);
	}
	
	public void addMessage(String message) {
		subject.setState(message + " from Phone Client");
	}
	
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Phone Client: "+ subject.getState());
	}

}
