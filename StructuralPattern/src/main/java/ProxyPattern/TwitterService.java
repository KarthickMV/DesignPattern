package ProxyPattern;

public interface TwitterService {
	public String getTimeline(String hashTag);
	public String postToTimeline(String hashTag, String message);
}
