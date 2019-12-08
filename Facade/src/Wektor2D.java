public class Wektor2D {
	private Wektor3D w3d;
	
	private Wektor2D(Wektor3D w2) {
		w3d = w2;
	}
	
	public Wektor2D(double x, double y) {
		w3d =  new Wektor3D(x,y,0);
	}
	
	public Wektor2D add(Wektor2D w2) {
		return new Wektor2D(w3d.add(w2.w3d));
	}
	
	public Wektor2D multiply(double scalar) {
		return new Wektor2D(w3d.multiply(scalar));
	}
	
	@Override
	public String toString() {
		return "["+w3d.x+","+w3d.y+"]";
	}
}
