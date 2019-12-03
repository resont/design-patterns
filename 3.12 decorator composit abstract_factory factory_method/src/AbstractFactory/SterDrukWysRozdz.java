package AbstractFactory;

public class SterDrukWysRozdz implements SterownikDrukarki {
	@Override
	public void drukuj() {
		SDWR.drukuj();
	}
}
