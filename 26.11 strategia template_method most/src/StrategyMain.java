
public class StrategyMain {

	class Zamowienie{
		protected ObliczPodatek pPodatek;
		
		public double obliczPodatek() {
			pPodatek.kwotaPodatku();
		}
	}
	
	class ObliczPodatek{
		
		public double kwotaPodatku() {
			return 0;
		}
		
	}
	public static void main(String[] args) {
		
	}

}
