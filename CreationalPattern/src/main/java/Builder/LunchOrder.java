package Builder;

public class LunchOrder {

	public static class Builder{
		private String bread;
		private String condiments;
		private String meat;
		private String dressing;
		
		public Builder() {
			
		}
		
		public LunchOrder build() {
			return new LunchOrder(this);
		}
		
		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}
		public Builder condiments(String condiments) {
			this.condiments = condiments;
			return this;
		}
		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}
		
		public Builder dressing(String dressing) {
			this.dressing = dressing;
			return this;
		}
	}
	
	private final String bread;
	private final String condiments;
	private final String meat;
	private final String dressing;
	
	public LunchOrder(Builder builder) {
		this.bread=builder.bread;
		this.condiments=builder.condiments;
		this.meat=builder.meat;
		this.dressing=builder.dressing;
	}
	

	public String getBread() {
		return this.bread;
	}
	
	public String getCondiments() {
		return this.condiments;
	}
	
	public String getMeat() {
		return this.meat;
	}
	
	public String getDresssing() {
		return this.dressing;
	}
	
}
