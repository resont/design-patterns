abstract class Figura{
	private Biblioteka bg;
	
	public Figura(Biblioteka bg) {
		this.bg = bg;
	}
	
	public abstract void rysuj();
	
	protected void rysujLinie(double x1, double y1, double x2, double y2) {
		bg.rysujLinie(x1, y1, x2, y2);
	}
	
	protected void rysujOkrag(double x, double y, double r) {
		bg.rysujOkrag(x, y, r);
	}
	
}
