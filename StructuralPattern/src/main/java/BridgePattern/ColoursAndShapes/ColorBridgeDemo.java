package BridgePattern.ColoursAndShapes;

public class ColorBridgeDemo {
	
	public static void main(String[] args) {
		Color red =  new Red();
		Shape square = new Square(red);
		
		Color green = new Green();
		Shape rectangle = new Rectangle(green);
		
		square.applyColor();
		rectangle.applyColor();
		
	}

}
