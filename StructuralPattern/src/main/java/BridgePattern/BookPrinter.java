package BridgePattern;

import java.util.ArrayList;
import java.util.List;

public class BookPrinter extends Printer {

	protected Book book;
	
	public BookPrinter(Book book) {
		this.book = book;
	}
	
	@Override
	public String getHeader() {
		// TODO Auto-generated method stub
		return this.book.getAuthor();
	}

	@Override
	public List<Detail> getDetails() {
List<Detail> details = new ArrayList<Detail>();
		
		details.add(new Detail("TITLE",this.book.getName()));
		details.add(new Detail("PRICE", this.book.getPrice()));
		details.add(new Detail("CLASSIFICATION", this.book.getClassification()));
		
		
		return details;
	}

	
}
