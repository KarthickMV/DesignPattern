package CompositePattern;

public class CompositePatternDemo {
	
	public static void main(String[] args) {
		Menu mainMenu = new Menu("Main","localhost/main");
		MenuItem safetyMenuItem = new MenuItem("Safety","main/safety");
		mainMenu.add(safetyMenuItem);
		Menu claimsSubMenu = new Menu("claims","/Claims");
		mainMenu.add(claimsSubMenu);
		MenuItem personalClaimsSubMenu = new MenuItem("Personal Claims","/Personal Claims");
		claimsSubMenu.add(personalClaimsSubMenu);
		
		System.out.println(mainMenu.toString());
	}

}
