package FlyWeightPattern;

public class Order {
	
	public int orderNumber;
	private Item item;
	
	public Order(Item item, int orderNumber) {
		this.item = item;
		this.orderNumber = orderNumber;
	}
	
	public void processOrder() {
		System.out.println("Processing order for:"+ item+" with so many values"+orderNumber);
		//DeliveryManagement.processOrder(Item item, User user, String ShippingLocation);
	}

}
