class BazaDanychOracle extends BazaDanych{

	@Override
	public void wykonajSelect(String query) {
		System.out.println(query+" - Przesy³am do bazy Oracle");
	}
	
}