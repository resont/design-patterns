class Okrag extends Figura{

	double x, y, r;
	public Okrag(Biblioteka bg, double x, double y, double r) {
		super(bg);
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	@Override
	public void rysuj(){
		rysujOkrag(x, y, r);
	}
	
}