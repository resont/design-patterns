public class Wektor3D {
	double x, y, z;
	public Wektor3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Wektor3D add(Wektor3D w2) {
		return new Wektor3D(this.x+w2.x,this.y+w2.y,this.z+w2.z);
	}
	
	public Wektor3D multiply(double scalar) {
		return new Wektor3D(this.x*scalar,this.y*scalar,this.z*scalar);
	}
	
	@Override
	public String toString() {
		
		return "["+x+","+y+","+z+"]";
	}
}
