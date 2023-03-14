package ProxyPattern;

public class ProxyPatternDemo {
	
	public static void main(String[] args) {
		TwitterService tS = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
		//TwitterService tS = new TwitterServiceStub();
		System.out.println(tS.getTimeline("Shivanna"));
		System.out.println(tS.postToTimeline("Shivanna", "Hi"));
	}

}
