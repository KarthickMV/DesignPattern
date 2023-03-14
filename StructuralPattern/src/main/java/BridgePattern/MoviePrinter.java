package BridgePattern;

import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer {

	protected Movie movie;
	
	public MoviePrinter(Movie movie) {
		this.movie = movie;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getHeader() {
		return this.movie.getClassification();
	}

	@Override
	public List<Detail> getDetails() {
		List<Detail> details = new ArrayList<Detail>();
		
		details.add(new Detail("TITLE",this.movie.getTitle()));
		details.add(new Detail("RUNTIME", this.movie.getRuntime()));
		details.add(new Detail("RATING", this.movie.getRating()));
		
		
		return details;
	}

}
