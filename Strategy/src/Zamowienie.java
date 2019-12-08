import java.util.Map;

public class Zamowienie {
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
