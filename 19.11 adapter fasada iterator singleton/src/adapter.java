
public class adapter {
	
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
			// TODO Auto-generated method stub
			
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
			// TODO Auto-generated method stub
			
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
			// TODO Auto-generated method stub
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
