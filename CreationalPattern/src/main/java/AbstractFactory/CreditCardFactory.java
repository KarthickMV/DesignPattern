package AbstractFactory;

public abstract class CreditCardFactory {

	public static CreditCardFactory getCreditCardFactory(int CreditScore) {
		if(CreditScore>600) {
			return new VisaFactory();
		}else {
			return new AmexFactory();
		}
	}
	
	public abstract CreditCard getCreditCard(CardType cardType);
	
	public abstract Validator getValidator(CardType cardType);
	
	
}
