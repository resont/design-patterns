
public class AdapterMain {
	
	public abstract class Figura{
		
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
	
	public class Punkt extends Figura{
		
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
	
	public class Linia extends Figura{
		
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
	
	public class Kwadrat extends Figura{
		
		public Kwadrat(double x, double y) {
			super();
			this.x = x;
			this.y = y;
		}
		
		@Override
		public void wyswietl() {
			System.out.println("Rysujê kwadrat\nWype³nienie: "+this.wypelnienie+"\nKolor: "+this.kolor);
			
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
	
	public static class XXOkrag{
		static boolean wyp = false;
		static double x;
		static double y;
		static String kolor = "Bia³y";
	
		public static void wyswietlaj() {
			System.out.println("Rysujê okr¹g\nWype³nienie: "+wyp+"\nKolor: "+kolor);
		}
		
		public static void wypelniaj(boolean wp) {
			wyp = wp;
		}
		
		public static void usuwaj() {
			System.out.println("Usuwam okr¹g");
			
		}
		
		public static void pobierzPolozenie() {
			System.out.println("("+x+","+y+")"); 
		}
		
		public static void nadajPolozenie(double x_, double y_) {
			x = x_;
			y = y_;
		}
		
		public static void ustawKolor(String kolor_) {
			kolor = kolor_;
		}
		
		
		
		
	}
	
	public class Okrag extends Figura{

		public Okrag(double x, double y) {
			XXOkrag.x = x;
			XXOkrag.y = y;
		}
		
		@Override
		public void wyswietl() {
			XXOkrag.wyswietlaj();
		}

		@Override
		public void wypelnij(boolean wyp) {
			XXOkrag.wypelniaj(wyp);
		}

		@Override
		public void usun() {
			XXOkrag.usuwaj();
		}

		@Override
		public void pobierzPolozenie() {
			XXOkrag.pobierzPolozenie();
		}

		@Override
		public void nadajPolozenie(double x, double y) {
			XXOkrag.nadajPolozenie(x, y);
		}

		@Override
		public void nadajKolor(String kolor) {
			XXOkrag.ustawKolor(kolor);
		}
		
		
		
	}

	public static void main(String[] args) {
		
		AdapterMain ad = new AdapterMain();
		
		Figura[] figury = new Figura[3];
		
		figury[0] = ad.new Punkt(2.0,3.5);
		figury[1] = ad.new Linia(5.0,2.3);
		figury[2] = ad.new Kwadrat(6.1,7.2);
		
		Okrag okrag = ad.new Okrag(11.3,8.0);
		
		for(Figura f: figury) {
			f.nadajKolor("Czarny");
			f.wypelnij(true);
			f.wyswietl();
			f.nadajPolozenie(8, 8);
			f.pobierzPolozenie();
			System.out.println();
			
		}
		
		okrag.nadajKolor("Zielony");
		okrag.wypelnij(true);
		okrag.wyswietl();
		okrag.nadajPolozenie(2.5, 3.7);
		okrag.pobierzPolozenie();
		
		

	}

}
