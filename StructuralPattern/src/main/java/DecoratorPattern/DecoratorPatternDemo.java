package DecoratorPattern;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sandwich snadwich = new DressingDecorator(new ChickenDecorator(new SimpleSandwich()));
		System.out.println(snadwich.make());
		
		Sandwich snadwich2 = new DressingDecorator(new ChickenDecorator(new BrownBreadSandwich()));
		System.out.println(snadwich2.make());
	}

}
