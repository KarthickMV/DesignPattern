package Prototype;

public class Record implements Cloneable {
	
	public Record clone() {
		try {
			return (Record) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
