
public abstract class Figura {
	String polozenie;
	double x, y;
	boolean wypelnienie = false;
	String kolor = "Bia³y";
	
	public void pobierzPolozenie() {
		System.out.println("("+x+","+y+")"); 
	}
	
	public void nadajPolozenie(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void wyswietl();
	public abstract void wypelnij(boolean wyp);
	
	public void nadajKolor(String kolor) {
		this.kolor = kolor;
	}
	public abstract void usun();
}
