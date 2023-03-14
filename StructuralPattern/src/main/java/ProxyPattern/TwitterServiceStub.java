package ProxyPattern;

public class TwitterServiceStub implements TwitterService {

	public String getTimeline(String hashTag) {
		return "Hey how are you ?";
	}

	public String postToTimeline(String hashTag, String message) {
		// TODO Auto-generated method stub
		return "I'm good buddy";
	}

}
