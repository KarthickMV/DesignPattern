package CompositePattern;

import java.util.Iterator;

public class Menu extends MenuComponent{
	
	public Menu(String Name, String Url) {
		this.Name = Name;
		this.Url = Url;
	}
	@Override
	public MenuComponent add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
		return menuComponent;
	}
	@Override
	public MenuComponent remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
		return menuComponent;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(print(this));
		Iterator<MenuComponent> iterator =  menuComponents.iterator();
		
		while(iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			builder.append(menuComponent.toString());
		}
		
		return builder.toString();
	}
	
	
}
