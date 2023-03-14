package Prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		Registry registry = new Registry();
		Movie firstMovie = (Movie) registry.createItem("Afternoon Movie");
		firstMovie.setTitle("John Wick");
		System.out.println(firstMovie);
		System.out.println(firstMovie.getRunTime());
		System.out.println(firstMovie.getTitle());
		System.out.println(firstMovie.getUrl());
		
		
		Movie anotherMovie = (Movie) registry.createItem("Evening Movie");
		anotherMovie.setTitle("John Wick 2");
		System.out.println(anotherMovie);
		System.out.println(anotherMovie.getRunTime());
		System.out.println(anotherMovie.getTitle());
		System.out.println(anotherMovie.getUrl());
		
		
		
	}
}
