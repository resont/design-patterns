
public class DecoratorMain {

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

interface Komponent{
	void drukuj();
}

class Potwierdzenie implements Komponent{

	@Override
	public void drukuj() {
		System.out.println("POTWIERDZENIE");
	}
	
}

abstract class DekoratorPotwierdzenia implements Komponent{
	protected Komponent mojKomponent;
	
	public DekoratorPotwierdzenia(Komponent mojKomponent) {
		super();
		this.mojKomponent = mojKomponent;
	}
	
	public void drukuj() {
		if(this.mojKomponent != null) {
			this.mojKomponent.drukuj();
		}
	}
}

class DekoratorNaglowka1 extends DekoratorPotwierdzenia{
	
	public DekoratorNaglowka1(Komponent mojKomponent) {
		super(mojKomponent);
	}

	@Override
	public void drukuj() {
		drkNaglowek();
		this.mojKomponent.drukuj();
	}
	
	public void drkNaglowek() {
		System.out.println("NAG£ÓWEK 1");
	}
}

class DekoratorNaglowka2 extends DekoratorPotwierdzenia{
	
	public DekoratorNaglowka2(Komponent mojKomponent) {
		super(mojKomponent);
	}

	@Override
	public void drukuj() {
		drkNaglowek();
		this.mojKomponent.drukuj();
	}
	
	public void drkNaglowek() {
		System.out.println("NAG£ÓWEK 2");
	}
}

class DekoratorStopki1 extends DekoratorPotwierdzenia{
	
	public DekoratorStopki1(Komponent mojKomponent) {
		super(mojKomponent);
	}

	@Override
	public void drukuj() {
		this.mojKomponent.drukuj();
		drkStopka();
	}
	
	public void drkStopka() {
		System.out.println("STOPKA 1");
	}
}

class DekoratorStopki2 extends DekoratorPotwierdzenia{
	
	public DekoratorStopki2(Komponent mojKomponent) {
		super(mojKomponent);
	}

	@Override
	public void drukuj() {
		this.mojKomponent.drukuj();
		drkStopka();
	}
	
	public void drkStopka() {
		System.out.println("STOPKA 2");
	}
}

class Konfiguracja implements Komponent{
	protected static Komponent mojKomponent;
	
	public static Komponent pobierzPotwierdzenie(DekoratorPotwierdzenia dk) {
		mojKomponent = dk;
		return mojKomponent;
	}

	@Override
	public void drukuj() {
		mojKomponent.drukuj();
		
	}
	
}
