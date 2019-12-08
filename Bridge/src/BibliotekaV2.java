class BibliotekaV2 implements Biblioteka{

	@Override
	public void rysujLinie(double x1, double y1, double x2, double y2) {
		BG2.narysujLinie(x1, y1, x2, y2);
	}

	@Override
	public void rysujOkrag(double x, double y, double r) {
		BG2.narysujOkrag(x, y, r);		
	}
	
}