package InterpreterPattern;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression {

	private String keyWord;
	
	public TerminalExpression(String keyWord) {
		this.keyWord = keyWord;
	}
	
	
	public boolean interpret(String Context) {
		StringTokenizer sT = new StringTokenizer(Context);
		while(sT.hasMoreElements()) {
			String tempWord = sT.nextToken();
			if(tempWord.equalsIgnoreCase(keyWord)) {
				return true;
			}
		}
		return false;	
	}

}
