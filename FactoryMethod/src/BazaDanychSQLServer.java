class BazaDanychSQLServer extends BazaDanych{

	@Override
	public void wykonajSelect(String query) {
		System.out.println(query+" - Przesy�am do bazy SQLServer");
	}
	
}