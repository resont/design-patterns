
public class Punkt extends Figura {

	public Punkt(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void wyswietl() {
		System.out.println("Rysujê punkt\nWype³nienie: "+this.wypelnienie+"\nKolor: "+this.kolor);
		
	}

	@Override
	public void wypelnij(boolean wyp) {
		this.wypelnienie = wyp;
	}

	@Override
	public void usun() {
		System.out.println("Usuwam punkt");
		
	}
}
