import java.util.Map;

public class Main {

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

