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