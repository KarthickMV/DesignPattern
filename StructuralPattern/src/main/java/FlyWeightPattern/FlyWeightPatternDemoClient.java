package FlyWeightPattern;

public class FlyWeightPatternDemoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InventoryManagementSystem iMS = new InventoryManagementSystem();
		
		iMS.takeOrder("Samsung TV", 20);
		iMS.takeOrder("iPhone", 40);
		iMS.takeOrder("iPad", 100);
		iMS.takeOrder("Samsung TV", 30);
		iMS.takeOrder("iPhone", 60);
		iMS.takeOrder("iPad", 120);
		
		iMS.checkoutCart();
		System.out.println(iMS.report());

	}

}
