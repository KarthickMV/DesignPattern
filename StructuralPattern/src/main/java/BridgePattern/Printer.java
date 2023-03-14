package BridgePattern;

import java.util.List;

public abstract class Printer {
	
	
	public void print(Formatter formatter) {
		formatter.format(getHeader(),getDetails());
	}
	
	public abstract String getHeader();
	
	public abstract List<Detail> getDetails();

}
