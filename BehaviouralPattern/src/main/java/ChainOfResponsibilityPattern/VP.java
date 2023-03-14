package ChainOfResponsibilityPattern;

public class VP extends Handler {

	@Override
	public void handleRequest(Request request) {
		// TODO Auto-generated method stub
		if(request.getRequestType().equals(RequestType.PURCHASE) && request.getRequestAmt()<1500) {
			System.out.println("Request approved for Purchase bearing an amount :"+request.getRequestAmt());
		}else {
			successor.handleRequest(request);
		}
	}

}
