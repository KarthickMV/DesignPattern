package Factory;

public class FactoryDemo {
	
	public static void main(String[] args) {
		Website Website1 = WebsiteFactory.getWebsite(WebsiteType.BLOG);
		System.out.println(Website1.getPages());
		Website Website2 = WebsiteFactory.getWebsite(WebsiteType.SHOP);
		System.out.println(Website2.getPages());
	}

}
