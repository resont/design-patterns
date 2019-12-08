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