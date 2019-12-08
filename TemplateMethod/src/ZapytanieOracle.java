
public class ZapytanieOracle extends SzablonZapytania {

	@Override
	protected String formatujSelect(String query) {
		return query+";";
	}

}
