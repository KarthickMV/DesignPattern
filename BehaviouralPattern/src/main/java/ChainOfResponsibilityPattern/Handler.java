package ChainOfResponsibilityPattern;

public abstract class Handler {
	
	public Handler successor;
	
	public  void  setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	public abstract void handleRequest(Request request) ;
}
