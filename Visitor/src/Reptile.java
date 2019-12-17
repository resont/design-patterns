
public class Reptile extends Animal {

	public Reptile(double price, boolean healthy) {
		super("gad", price, healthy);
	}

	@Override
	public void Accept(Visitor v) {
		v.Visit(this);
	}

}
