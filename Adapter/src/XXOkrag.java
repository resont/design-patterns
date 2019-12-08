public class XXOkrag {
	boolean wyp = false;
	double x;
	double y;
	String kolor = "Bia�y";
	
	public XXOkrag(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void wyswietlaj() {
		System.out.println("Rysuj� okr�g\nWype�nienie: "+wyp+"\nKolor: "+kolor);
	}
	
	public void wypelniaj(boolean wp) {
		wyp = wp;
	}
	
	public void usuwaj() {
		System.out.println("Usuwam okr�g");
		
	}
	
	public void pobierzPolozenie() {
		System.out.println("("+x+","+y+")"); 
	}
	
	public void nadajPolozenie(double x_, double y_) {
		x = x_;
		y = y_;
	}
	
	public void ustawKolor(String kolor_) {
		kolor = kolor_;
	}
}
