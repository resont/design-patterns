
public class Main {

	public static void main(String[] args) {
		
		Biblioteka bg1 = new BibliotekaV1();
		Biblioteka bg2 = new BibliotekaV2();
		
		Figura f1 = new Prostokat(bg1,1,3,5,7);
		Figura f2 = new Okrag(bg2,1,3,5);
		
		f1.rysuj();
		f2.rysuj();

	}

}



