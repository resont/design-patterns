public class Main {

	public static void main(String[] args) {
		
		FabrykaSter kN = new Konfiguracja().fabrykaNR();
		FabrykaSter kW = new Konfiguracja().fabrykaWR();
		
		ApNadzorujaca nr = new ApNadzorujaca(kN);
		nr.rysuj();
		nr.drukuj();
		
		ApNadzorujaca wr = new ApNadzorujaca(kW);
		wr.rysuj();
		wr.drukuj();
	}

}
