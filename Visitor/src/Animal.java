
public abstract class Animal {
	protected double price;
	protected String type;
	protected boolean healthy;
	
	public Animal(String type, double price, boolean healthy) {
		this.type = type;
		this.price = price;
		this.healthy = healthy;
	}
	
	public String show() {
		return "Gatunek: "+type+"\tCena: "+price+"\tJest zdrowy: "+healthy;
	}
	
	public abstract void Accept(Visitor v);
	
	public double getPrice() { return price;}
	public String getType() { return type;}
	public boolean getHealthy() { return healthy;}
}
