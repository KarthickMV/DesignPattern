package Prototype;

import java.util.HashMap;

public class Registry {

	private HashMap<String,Item> items = new HashMap<String,Item>();
	
	public Registry() {
		loadItems();
	}

	public Object createItem(String type) {
		try {
			return (Object) (items.get(type)).clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	private void loadItems() {
		Movie movie = new Movie();
		movie.setRunTime("Today Evening");
		movie.setPrice(25);
		movie.setTitle("Inception");
		items.put("Evening Movie", movie);
		
		Movie movie1 = new Movie();
		movie1.setRunTime("Today Afternoon");
		movie1.setPrice(25);
		movie1.setTitle("Runway 34");
		items.put("Afternoon Movie",movie1);
		
		Book book = new Book();
		book.setNoOfPages(200);
		book.setTitle("The magic");
		book.setPrice(3);
		items.put("book", book);
	}
	
}
