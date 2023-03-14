package DecoratorPattern;

public class DressingDecorator extends SandwichDecorator {

	public DressingDecorator(Sandwich customizeSandwich) {
		super(customizeSandwich);
		// TODO Auto-generated constructor stub
	}
	
	public String make() {
		return customizeSandwich.make()+ addDressing();
	}

	private String addDressing() {
		// TODO Auto-generated method stub
		return " + Tandoori Mayo";
	}

}
