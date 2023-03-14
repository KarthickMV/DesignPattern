package AbstractFactory;

public class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch(cardType) {
		case BASE:
			return new VisaCreditCard();
		case BLACK:
			return new VisaBlackCreditCard();
		case GOLD:
			return new VisaGoldCreditCard();
		default :
			return null;
	}
	}

	@Override
	public Validator getValidator(CardType cardType) {
		switch(cardType) {
		case BASE:
			return new VisaValidator();
		case BLACK:
			return new VisaValidator();
		case GOLD:
			return new VisaValidator();
		default :
			return null;
		}
	}

}
