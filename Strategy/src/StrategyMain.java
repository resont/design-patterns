import java.util.Map;

public class StrategyMain {

	public static void main(String[] args) {
		
		Map <String,Double> Artykuly = Map.of("CocaCola",1.99,"Mars",2.99,"KitKat",3.99);
		PodatekPolska PL = new PodatekPolska();
		PodatekNiemcy GER = new PodatekNiemcy();
		Zamowienie zamowienie = new Zamowienie(PL,Artykuly);

		System.out.println("Polska:");
		zamowienie.obliczPodatek();
		
		System.out.println("\nNiemcy:");
		zamowienie.kraj(GER);
		zamowienie.obliczPodatek();
		
	}

}

class Zamowienie{

	protected ObliczPodatek pPodatek;
	protected Map <String,Double> Artykuly;
	
	public Zamowienie(ObliczPodatek pPodatek, Map <String,Double> Artykuly) {
		this.pPodatek = pPodatek;
		this.Artykuly = Artykuly;
	}
	
	public void kraj(ObliczPodatek pPodatek) {
		this.pPodatek = pPodatek;
	}
	
	public void obliczPodatek() {
		for(Map.Entry<String,Double> entry: Artykuly.entrySet()) {
			System.out.println("Produkt: "+entry.getKey()+" | Cena brutto: "+pPodatek.kwotaPodatku(entry.getValue()));
		}
		
	}
}

interface ObliczPodatek{
	
	final double VAT_PL = 0.23;
	final double VAT_GER = 1.5;
	
	public double kwotaPodatku(double cena);
	
}

class PodatekPolska implements ObliczPodatek{

	public double kwotaPodatku(double cena) {
		return cena + (cena * VAT_PL);
	}
	
}

class PodatekNiemcy implements ObliczPodatek{

	public double kwotaPodatku(double cena) {
		return cena + VAT_GER;
	}
	
}
