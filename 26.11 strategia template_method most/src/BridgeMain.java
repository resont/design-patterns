
public class BridgeMain {

	public static void main(String[] args) {
		
		Biblioteka bg1 = new BibliotekaV1();
		Figura f1 = new Prostokat(bg1,1,1,2,2);
		
		Biblioteka bg2 = new BibliotekaV2();
		Figura f2 = new Okrag(bg2,2,2,4);
		
		f1.rysuj();
		f2.rysuj();

	}

}

interface Biblioteka{
	public abstract void rysujLinie(double x1, double y1, double x2, double y2);
	public abstract void rysujOkrag(double x, double y, double r);
}

class BibliotekaV1 implements Biblioteka{

	@Override
	public void rysujLinie(double x1, double y1, double x2, double y2) {
		BG1.narysujLinie(x1, y1, x2, y2);
	}

	@Override
	public void rysujOkrag(double x, double y, double r) {
		BG1.narysujOkrag(x, y, r);	
	}
	
}

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

class BG1{
	public static void narysujLinie(double x1, double y1, double x2, double y2) {
		System.out.println("Rysujê linie za pomoc¹ biblioteki graficznej BG1");
	}
	
	public static void narysujOkrag(double x, double y, double r) {
		System.out.println("Rysujê okr¹g za pomoc¹ biblioteki graficznej BG1");
	}
}

class BG2{
	public static void narysujLinie(double x1, double y1, double x2, double y2) {
		System.out.println("Rysujê linie za pomoc¹ biblioteki graficznej BG2");
	}
	
	public static void narysujOkrag(double x, double y, double r) {
		System.out.println("Rysujê okr¹g za pomoc¹ biblioteki graficznej BG2");
	}
}

class Figura{
	private Biblioteka bg;
	
	public Figura(Biblioteka bg) {
		this.bg = bg;
	}
	
	public void rysuj() {}
	
	public void rysujLinie(double x1, double y1, double x2, double y2) {
		bg.rysujLinie(x1, y1, x2, y2);
	}
	
	public void rysujOkrag(double x, double y, double r) {
		bg.rysujOkrag(x, y, r);
	}
	
}

class Prostokat extends Figura{
	
	double x1, x2, y1, y2;
	public Prostokat(Biblioteka bg, double x1, double y1, double x2, double y2) {
		super(bg);
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	@Override
	public void rysuj() {
		rysujLinie(x1,y1,x2,y1);
		rysujLinie(x2,y1,x2,y2);
		rysujLinie(x2,y2,x1,y2);
		rysujLinie(x1,y2,x1,y1);
	}
}

class Okrag extends Figura{

	double x, y, r;
	public Okrag(Biblioteka bg, double x, double y, double r) {
		super(bg);
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	@Override
	public void rysuj(){
		rysujOkrag(x, y, r);
	}
	
}


