package Factory;

public class Shop extends Website {

	@Override
	public void createWebsites() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());
		
	}

}
