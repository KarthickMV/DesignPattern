package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	
	public abstract void setState(String state);
	public abstract String getState();
	
	public void append(Observer observer) {
		this.observers.add(observer);
	}
	
	public void notifyObservers() {
		for(Observer observer:observers) {
			observer.update();
		}
	}
	
	
}
