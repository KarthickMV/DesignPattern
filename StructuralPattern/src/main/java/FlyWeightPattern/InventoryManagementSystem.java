package FlyWeightPattern;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManagementSystem {
	
	private Catalog catalog = new Catalog();
	private List<Order> orders = new CopyOnWriteArrayList<Order>();
	
	
	public void takeOrder(String name, int orderNumber) {
		Item item = catalog.lookup(name);
		Order order = new Order(item, orderNumber);
		orders.add(order);
	}
	
	public void checkoutCart() {
		for(Order order: orders) {
			order.processOrder();
			orders.remove(order);
		}
	}
	
	public String report() {
		return "Total objects created were: "+catalog.itemCreatedNumber(); 
	}
	
	
	
	
	

}
