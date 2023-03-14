package FlyWeightPattern;

import java.util.HashMap;
//Flwyweight Factory
public class Catalog {
	
	private HashMap<String, Item> itemList =  new HashMap<String,Item>();

	
	public Item lookup(String itemName) {
		Item item;
		if(!itemList.containsKey(itemName)) {
			item = new Item(itemName);
			itemList.put(itemName,item);
		}
		item = itemList.get(itemName);
		return item;
	}
	
	public int itemCreatedNumber() {
		return itemList.size();
	}

}
