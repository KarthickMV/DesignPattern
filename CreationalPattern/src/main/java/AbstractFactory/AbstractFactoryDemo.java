package AbstractFactory;

public class AbstractFactoryDemo {
	
	public static void main(String[] args) {
		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(700);
		CreditCard card = abstractFactory.getCreditCard(CardType.GOLD);
		System.out.println(card.getClass());
		
		CreditCardFactory abstractFactory2 = CreditCardFactory.getCreditCardFactory(400);
		CreditCard card2 = abstractFactory2.getCreditCard(CardType.PLATINUM);
		System.out.println(card2.getClass());
		
		
	}

}
