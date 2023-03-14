package ChainOfResponsibilityPattern;

public class Director extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getRequestType().equals(RequestType.CONFERENCE)) {
			System.out.println("Request for Conference approved by the Director");
		}else {
			successor.handleRequest(request);
		}
	}
	
}
