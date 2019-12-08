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