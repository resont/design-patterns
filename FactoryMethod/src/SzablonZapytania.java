abstract class SzablonZapytania{
	
	public void wykonajZapytanie(String specZapyt) {
		String komendaBD;
		BazaDanych baza = UtworzBD();
		
		komendaBD = formatujSelect(specZapyt);
		
		System.out.println(komendaBD);
		baza.wykonajSelect(komendaBD);
	}
	protected abstract String formatujSelect(String query);
	public abstract BazaDanych UtworzBD();
}