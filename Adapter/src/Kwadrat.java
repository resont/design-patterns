
public class Kwadrat extends Figura {

	public Kwadrat(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void wyswietl() {
		System.out.println("Rysuj� kwadrat\nWype�nienie: "+this.wypelnienie+"\nKolor: "+this.kolor);
		
	}

	@Override
	public void wypelnij(boolean wyp) {
		this.wypelnienie = wyp;
	}

	@Override
	public void usun() {
		System.out.println("Usuwam kwadrat");
		
	}

}
