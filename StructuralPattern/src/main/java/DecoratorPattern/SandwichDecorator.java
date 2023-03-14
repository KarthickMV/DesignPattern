package DecoratorPattern;

public abstract class SandwichDecorator implements Sandwich {
	
	protected Sandwich customizeSandwich;
	
	public SandwichDecorator(Sandwich customizeSandwich) {
		this.customizeSandwich = customizeSandwich;
	}
	
	public String make() {
		return this.customizeSandwich.make();
	}

}
