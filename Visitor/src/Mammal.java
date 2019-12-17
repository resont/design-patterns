
public class Mammal extends Animal {

	public Mammal(double price, boolean healthy) {
		super("ssak", price, healthy);
	}

	@Override
	public void Accept(Visitor v) {
		v.Visit(this);
	}

}
