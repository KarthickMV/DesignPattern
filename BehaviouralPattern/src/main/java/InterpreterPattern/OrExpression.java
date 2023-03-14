package InterpreterPattern;

public class OrExpression implements Expression{
	
	private Expression exp1;
	private Expression exp2;
	
	public OrExpression(Expression exp1, Expression exp2 ) {
		this.exp1 = exp1;
		this.exp2 = exp2;
	}
	
	
	public boolean interpret(String Context) {
		// TODO Auto-generated method stub
		return exp1.interpret(Context) || exp2.interpret(Context);
	}

}
