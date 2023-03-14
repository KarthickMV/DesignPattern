package ChainOfResponsibilityPattern;

public class Request {
	private RequestType type;
	private int requestAmt;
	
	public Request(RequestType type, int requestAmt) {
		this.requestAmt=requestAmt;
		this.type = type;
	}
	
	public RequestType getRequestType() {
		return this.type;
	}
	
	public int getRequestAmt() {
		return this.requestAmt;
	}

}
