package FlyWeightPattern;

public class Item {
	
	private String itemName;
	
	public Item(String itemName) {
		this.itemName = itemName;
	}
	
	public String toString() {
		return this.itemName;
	}

}
