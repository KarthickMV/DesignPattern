package ChainOfResponsibilityPattern;

public class ChainOfResponsibilityDemo {
	
	public static void main(String[] args) {
		
		Director bryan = new Director();
		VP jeff = new VP();
		CEO Mat = new CEO();
		
		bryan.setSuccessor(jeff);
		jeff.setSuccessor(Mat);
		
		Request request1 = new Request(RequestType.CONFERENCE,1500);
		Request request2 = new Request(RequestType.PURCHASE,1400);
		Request request3 = new Request(RequestType.PURCHASE,1700);

		bryan.handleRequest(request1);
		bryan.handleRequest(request2);
		bryan.handleRequest(request3);
		
	}

}
