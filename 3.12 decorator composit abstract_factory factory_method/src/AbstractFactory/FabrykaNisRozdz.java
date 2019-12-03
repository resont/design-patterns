package AbstractFactory;

public class FabrykaNisRozdz implements FabrykaSter {

	@Override
	public SterownikEkranu pobierzSterEkrn() {
		return new SterEkrnNisRozdz();
	}

	@Override
	public SterownikDrukarki pobierzSterDruk() {
		return new SterDrukNisRozdz();
	}

}
