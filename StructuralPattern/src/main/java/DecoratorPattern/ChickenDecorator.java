package DecoratorPattern;

public class ChickenDecorator extends SandwichDecorator {

	public ChickenDecorator(Sandwich customizeSandwich) {
		super(customizeSandwich);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String make() {
		return customizeSandwich.make()+ addChicken();
	}

	private String addChicken() {
		// TODO Auto-generated method stub
		return " + Chicken";
	}

}
