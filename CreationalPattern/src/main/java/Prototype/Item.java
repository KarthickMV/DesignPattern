package Prototype;

public abstract class Item implements Cloneable {
	private double price;
	private String title;
	private String url;
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
