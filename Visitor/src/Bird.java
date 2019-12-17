
public class Bird extends Animal {
	private double blackMarketPrice;

	public Bird(double price, double bPrice, boolean healthy) {
		super("ptak", price, healthy);
		blackMarketPrice = bPrice;
	}

	@Override
	public void Accept(Visitor v) {
		v.VisitBird(this);
	}
	
	public String show() {
		return super.show() +"\tCena na czarnym rynku: "+blackMarketPrice; 
	}
	
	public double getBMPrice() {
		return blackMarketPrice;
	}

}
