
public class Linia extends Figura {

	public Linia(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void wyswietl() {
		System.out.println("Rysujê liniê\nWype³nienie: "+this.wypelnienie+"\nKolor: "+this.kolor);
		
	}

	@Override
	public void wypelnij(boolean wyp) {
		this.wypelnienie = wyp;
	}

	@Override
	public void usun() {
		System.out.println("Usuwam linie");
		
	}

}
