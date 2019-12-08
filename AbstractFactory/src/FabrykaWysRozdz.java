public class FabrykaWysRozdz implements FabrykaSter {

	@Override
	public SterownikEkranu pobierzSterEkrn() {
		return new SterEkrnWysRozdz();
	}

	@Override
	public SterownikDrukarki pobierzSterDruk() {
		return new SterDrukWysRozdz();
	}

}
