
public class Main {

	public static void main(String[] args) {
		String query = "SELECT * FROM Tabela";
		
		SzablonZapytania templateSQL = new ZapytanieSQLServer();
		SzablonZapytania templateOracle = new ZapytanieOracle();
		
		templateSQL.wykonajZapytanie(query);
		System.out.println();
		templateOracle.wykonajZapytanie(query);
		
	}

}
