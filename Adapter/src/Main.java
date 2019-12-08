
public class Main {

	public static void main(String[] args) {
		
		Figura[] figury = new Figura[4];
		
		figury[0] = new Punkt(2.0,3.5);
		figury[1] = new Linia(5.0,2.3);
		figury[2] = new Kwadrat(6.1,7.2);
		figury[3] = new Okrag(new XXOkrag(11.3,8.0));
		
		for(Figura f: figury) {
			f.nadajKolor("Czarny");
			f.wypelnij(true);
			f.wyswietl();
			f.nadajPolozenie(8.1, 5.4);
			f.pobierzPolozenie();
			f.usun();
			System.out.println();
			
		}
		
		

	}

}
