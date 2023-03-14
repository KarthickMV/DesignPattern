package InterpreterPattern;

public class InterpreterPatternDemo {
	
	public static Expression createInterpreterTree() {
		TerminalExpression tE = new TerminalExpression("Shivani");
		TerminalExpression tE2 = new TerminalExpression("good");
		TerminalExpression tE3 = new TerminalExpression("bad");
		
		//good and bad
		Expression andExpression = new AndExpression(tE2,tE3);
		
		//Shivani or good
		Expression OrExpression = new OrExpression(tE,tE2);
		
		//(Shivani or good) or (good and bad)
		return new OrExpression(OrExpression,andExpression);
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String name = "Shivani Nagvekar is a good girl"; if(name.contains("Shivani"))
		 * { System.out.println("Name found"); }
		 */
		String context = "Shivani Nagvekar is a good girl";
		
		
		//Shivani or (good and bad)
		Expression expression = createInterpreterTree();
		
		System.out.println(expression.interpret(context));
		
	}

}
