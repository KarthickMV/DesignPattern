package BridgePattern;

public class PrinterBridgeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie = new Movie();
		movie.setClassification("Action");
		movie.setTitle("Mission Impossible");
		movie.setRuntime("12:30");
		movie.setRating("9.1");
		
		Printer moviePrinter = new MoviePrinter(movie);
		Formatter consoleFormatter = new ConsoleFormatter();
		moviePrinter.print(consoleFormatter);
		
		Book book = new Book();
		book.setName("The Magic");
		book.setAuthor("Rhonda");
		book.setClassification("Philosophical");
		book.setPrice("4.30");
		
		System.out.println("Printing Book");
		
		Printer bookPrinter = new BookPrinter(book);
		bookPrinter.print(consoleFormatter);
		
	}

}
