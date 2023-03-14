package CompositePattern;

public class MenuItem extends MenuComponent{
	
	public MenuItem(String name, String url) {
		this.Name = name;
		this.Url = url;
	}

	@Override
	public String toString() {
		return print(this);
	}

}
