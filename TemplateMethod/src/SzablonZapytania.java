
public abstract class SzablonZapytania {
	public void wykonajZapytanie(String specZapyt) {
		String komendaBD;
		
		komendaBD = formatujSelect(specZapyt);
		System.out.println(komendaBD);
	}
	
	protected abstract String formatujSelect(String query);
}
