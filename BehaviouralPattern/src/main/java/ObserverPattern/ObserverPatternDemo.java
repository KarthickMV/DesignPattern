package ObserverPattern;

public class ObserverPatternDemo {
	
	public static void main(String[] args) {
		Subject twitterStream = new TwitterStream();
		PhoneClient phoneClient = new PhoneClient(twitterStream);
		TabClient tabClient = new TabClient(twitterStream);
		LaptopClient laptopClient = new LaptopClient(twitterStream);
		
		phoneClient.addMessage("Hey Pillu");
		tabClient.addMessage("Hey Pillu, will you reply back ?");
	}

}
