
public class TemplateMain {

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
		
		komendaBD = formatujSelect(specZapyt);
		System.out.println(komendaBD);
	}
	
	protected abstract String formatujSelect(String query);
}

class ZapytanieSQLServer extends SzablonZapytania{

	@Override
	protected String formatujSelect(String query) {
		return query;
	}	
}

class ZapytanieOracle extends SzablonZapytania{

	@Override
	protected String formatujSelect(String query) {
		return query+";";
	}
}