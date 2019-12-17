
public class Fish extends Animal {

	public Fish(double price, boolean healthy) {
		super("ryba", price, healthy);
	}

	@Override
	public void Accept(Visitor v) {
		v.Visit(this);
	}

}
