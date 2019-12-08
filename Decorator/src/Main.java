
public class Main {

	public static void main(String[] args) {
		Komponent mojePotw;
		mojePotw = Konfiguracja.pobierzPotwierdzenie(
				new DekoratorNaglowka1(
				new DekoratorStopki2(
				new DekoratorStopki1(
				new Potwierdzenie()))));
		mojePotw.drukuj();
		
		System.out.println();
		
		mojePotw = Konfiguracja.pobierzPotwierdzenie(
				new DekoratorNaglowka1(
				new DekoratorNaglowka2(
				new DekoratorStopki2(
				new Potwierdzenie()))));
		mojePotw.drukuj();
	}

}
