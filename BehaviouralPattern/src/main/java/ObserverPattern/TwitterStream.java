package ObserverPattern;

import java.util.ArrayDeque;
import java.util.Deque;

public class TwitterStream extends Subject {

	private Deque<String> messageHistory = new ArrayDeque<String>();
	
	@Override
	public void setState(String state) {
		// TODO Auto-generated method stub
		this.messageHistory.add(state);
		this.notifyObservers();
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return this.messageHistory.getLast();
	}

}
