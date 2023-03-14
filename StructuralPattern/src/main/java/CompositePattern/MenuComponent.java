package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
	
	protected String Name;
	protected String Url;
	protected List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	
	public String getName() {
		return Name;
	}
	
	public String getUrl() {
		return Url;
	}
	
	public abstract String toString();
	
	public String print(MenuComponent menuComponent) {
		StringBuilder builder = new StringBuilder();
		builder.append(menuComponent.getName());
		builder.append(":");
		builder.append(menuComponent.getUrl());
		builder.append("\n");
		return builder.toString();
	}

	public MenuComponent add(MenuComponent menuComponent) throws Exception{
		throw new Exception("Feature not supported");
	}

	public MenuComponent remove(MenuComponent menuComponent) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Feature not supported");
	}
}
