package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class UtilObserverDemo {
	
	
	public static void main(String[] args) {
		UtilObserverDemo demo = new UtilObserverDemo();
		MessageStream youtuber = demo.new MessageStream();
		Client karthick = demo.new Client("Karthicks Mobile");
		Client Karthick1  = demo.new Client("Karthicks iPad");
		Client Shivani = demo.new Client("Shivani's OnePlus");
		youtuber.addObserver(karthick);
		youtuber.addObserver(Karthick1);
		youtuber.addObserver(Shivani);
		
		
		youtuber.uploadVideo();
		
		
		
		
		
	}
	
	public class MessageStream extends Observable{
		
		public void uploadVideo() {
			//Logic for uploading video
			setChanged();
			notifyObservers();
		}
		
	}
	
	public class Client implements Observer
	{
		
		private String name;
		public Client(String name) {
			this.name = name;
		}
		
		public void update(Observable o, Object arg) {
			// TODO Auto-generated method stub
			// send a notification widget to the client
			System.out.println("Notified to"+name);
		}
		
	}
}
