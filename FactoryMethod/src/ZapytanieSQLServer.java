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