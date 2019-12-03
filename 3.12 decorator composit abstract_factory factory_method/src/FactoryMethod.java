
public class FactoryMethod {

	public static void main(String[] args) {
		String query = "SELECT * FROM Tabela";
		
		SzablonZapytania templateSQL = new ZapytanieSQLServer();
		SzablonZapytania templateOracle = new ZapytanieOracle();
		
		templateSQL.wykonajZapytanie(query);
		System.out.println();
		templateOracle.wykonajZapytanie(query);
		
	}

}

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

class ZapytanieSQLServer extends SzablonZapytania{

	@Override
	protected String formatujSelect(String query) {
		return query;
	}

	@Override
	public BazaDanych UtworzBD() {
		return new BazaDanychSQLServer();
	}	
}

class ZapytanieOracle extends SzablonZapytania{

	@Override
	protected String formatujSelect(String query) {
		return query+";";
	}

	@Override
	public BazaDanych UtworzBD() {
		return new BazaDanychOracle();
	}
}

abstract class BazaDanych{
	public abstract void wykonajSelect(String query);
}

class BazaDanychSQLServer extends BazaDanych{

	@Override
	public void wykonajSelect(String query) {
		System.out.println(query+" - Przesy³am do bazy SQLServer");
	}
	
}
class BazaDanychOracle extends BazaDanych{

	@Override
	public void wykonajSelect(String query) {
		System.out.println(query+" - Przesy³am do bazy Oracle");
	}
	
}