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