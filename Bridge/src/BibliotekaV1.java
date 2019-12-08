class BibliotekaV1 implements Biblioteka{

	@Override
	public void rysujLinie(double x1, double y1, double x2, double y2) {
		BG1.rysuj_linie(x1, y1, x2, y2);
	}

	@Override
	public void rysujOkrag(double x, double y, double r) {
		BG1.rysuj_okrag(x, y, r);	
	}
}