package Builder;

public class LunchOrderDemo {

	public static void main(String[] args) {
		LunchOrder.Builder builder = new LunchOrder.Builder();
		
		builder.meat("Chicken").bread("Brown bread").condiments("Lettuce").dressing("tomato");
		
		LunchOrder order = builder.build();
		
		LunchOrder order2 = builder.build();
		
		System.out.println(order.getBread());
		System.out.println(order.getCondiments());
		System.out.println(order.getDresssing());
		System.out.println(order.getMeat());
	}
	
}
