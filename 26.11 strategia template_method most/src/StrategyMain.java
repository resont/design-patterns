import java.util.Map;

public class StrategyMain {

	public static void main(String[] args) {
		Map <String,Double> Artykuly = Map.of("CocaCola",1.99,"Mars",2.99,"KitKat",3.99);
		Zamowienie zamowienie = new Zamowienie();
		
		zamowienie.kraj(new PodatekPolska());
		System.out.printf("%.2f%n",zamowienie.obliczPodatek(1, Artykuly.get("CocaCola")));
		System.out.printf("%.2f%n",zamowienie.obliczPodatek(5, Artykuly.get("Mars")));
		System.out.printf("%.2f%n",zamowienie.obliczPodatek(3, Artykuly.get("KitKat")));
		
		System.out.println();
		
		zamowienie.kraj(new PodatekNiemcy());
		System.out.printf("%.2f%n",zamowienie.obliczPodatek(1, Artykuly.get("CocaCola")));
		System.out.printf("%.2f%n",zamowienie.obliczPodatek(5, Artykuly.get("Mars")));
		System.out.printf("%.2f%n",zamowienie.obliczPodatek(3, Artykuly.get("KitKat")));
	}

}

class Zamowienie{

	protected ObliczPodatek pPodatek;
	
	public void kraj(ObliczPodatek pPodatek) {
		this.pPodatek = pPodatek;
	}
	
	public double obliczPodatek(double ilosc, double cena) {
		return pPodatek.kwotaPodatku(ilosc, cena);
	}
}

interface ObliczPodatek{
	
	final double VAT_PL = 0.23;
	final double VAT_GER = 1.5;
	
	public double kwotaPodatku(double ilosc, double cena);
	
}

class PodatekPolska implements ObliczPodatek{

	public double kwotaPodatku(double ilosc, double cena) {
		return (cena + (cena * VAT_PL)) * ilosc;
	}
	
}

class PodatekNiemcy implements ObliczPodatek{

	public double kwotaPodatku(double ilosc, double cena) {
		return (cena + VAT_GER) * ilosc;
	}
	
}
