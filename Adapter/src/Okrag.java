public class Okrag extends Figura {

	private XXOkrag adaptee;

	public Okrag(XXOkrag adaptee) {
		super();
		this.adaptee = adaptee;
	}
	
	@Override
	public void wyswietl() {
		adaptee.wyswietlaj();
	}

	@Override
	public void wypelnij(boolean wyp) {
		adaptee.wypelniaj(wyp);
	}

	@Override
	public void usun() {
		adaptee.usuwaj();
	}

	@Override
	public void pobierzPolozenie() {
		adaptee.pobierzPolozenie();
	}

	@Override
	public void nadajPolozenie(double x, double y) {
		adaptee.nadajPolozenie(x, y);
	}

	@Override
	public void nadajKolor(String kolor) {
		adaptee.ustawKolor(kolor);
	}

}
