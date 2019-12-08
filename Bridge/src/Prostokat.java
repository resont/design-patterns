class Prostokat extends Figura{
	
	double x1, x2, y1, y2;
	public Prostokat(Biblioteka bg, double x1, double y1, double x2, double y2) {
		super(bg);
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	@Override
	public void rysuj() {
		rysujLinie(x1,y1,x2,y1);
		rysujLinie(x2,y1,x2,y2);
		rysujLinie(x2,y2,x1,y2);
		rysujLinie(x1,y2,x1,y1);
	}
}