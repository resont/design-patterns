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