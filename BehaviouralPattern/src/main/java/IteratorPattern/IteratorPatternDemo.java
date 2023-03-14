package IteratorPattern;

import java.util.Iterator;

public class IteratorPatternDemo {
	
	public static void main(String[] args) {
		BikeRepository bikes = new BikeRepository();
		
		bikes.addBike("Kawasaki");
		bikes.addBike("BMW");
		bikes.addBike("Triumph");
		
		Iterator<String> iT = bikes.iterator();
		
		while(iT.hasNext()) {
			System.out.println(iT.next());
		}
	}

}
