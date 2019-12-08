public class Konfiguracja {
	public FabrykaSter fabrykaNR() {
		return new FabrykaNisRozdz();
	}
	
	public FabrykaSter fabrykaWR() {
		return new FabrykaWysRozdz();
	}
}
