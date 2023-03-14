package IteratorPattern;

import java.util.Iterator;

public class BikeRepository implements Iterable{
	
	private String[] bikes;
	private int index;
	
	public BikeRepository() {
		bikes = new String[10];
		index=0;
	}
	
	public void addBike(String bikeName) {
		if(index == bikes.length) {
			String[] tempArray = new String[bikes.length+5];
			System.arraycopy(bikes, 0, tempArray,0 , bikes.length);
			bikes = tempArray;
			tempArray =null;
		}
		bikes[index] = bikeName;
		index++;
	}

	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		
		Iterator<String> iT = new Iterator<String>() {
			
			private int currentIndex =0;
			
			public boolean hasNext() {
				// TODO Auto-generated method stub
				
				return currentIndex < bikes.length && bikes[currentIndex] != null;
			}

			public String next() {
				// TODO Auto-generated method stub
				/*
				 * int tempIndex = currentIndex; currentIndex = currentIndex+1;
				 */
				return bikes[currentIndex++];
			}
			
		};
		return iT;
	}
	
	/*
	 * public class BikeIterator implements Iterator{
	 * 
	 * public boolean hasNext() { // TODO Auto-generated method stub return false; }
	 * 
	 * public Object next() { // TODO Auto-generated method stub return null; }
	 * 
	 * }
	 */

}
