public class ApNadzorujaca {
	protected FabrykaSter fb;
	
	public ApNadzorujaca(FabrykaSter fb) {
		this.fb = fb;
	}
	
	public void rysuj() {
		SterownikEkranu se = fb.pobierzSterEkrn();
		se.rysuj();
	}
	
	public void drukuj() {
		SterownikDrukarki sd = fb.pobierzSterDruk();
		sd.drukuj();
	}
}
