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