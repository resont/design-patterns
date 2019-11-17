
public class FacadeMain {
	
	public class Wektor3D{
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
	
	public class Wektor2D{
		private Wektor3D w3d;
		
		public Wektor2D(double x, double y) {
			w3d =  new Wektor3D(x,y,0);
		}
		
		
		public Wektor2D add(Wektor2D w2) {
			return new Wektor2D(w3d.x+w2.w3d.x,w3d.y+w2.w3d.y);
		}
		
		public Wektor2D multiply(double scalar) {
			return new Wektor2D(w3d.x*scalar,w3d.y*scalar);
		}
		
		@Override
		public String toString() {
			return "["+w3d.x+","+w3d.y+"]";
		}

		
		
	}

	public static void main(String[] args) {
		
		FacadeMain fa = new FacadeMain();
		
		Wektor3D w1 = fa.new Wektor3D(1, 2, 3);
		Wektor3D w2 = fa.new Wektor3D(4, 5, 6);
		Wektor3D w3 = w1.add(w2);
		Wektor3D w4 = w1.multiply(3);

		System.out.println(w3.toString());
		System.out.println(w4.toString());
		
		System.out.println();
		
		Wektor2D w5 = fa.new Wektor2D(3, 4);
		Wektor2D w6 = fa.new Wektor2D(4, 5);
		Wektor2D w7 = w5.add(w6);
		Wektor2D w8 = w5.multiply(3);

		System.out.println(w7.toString());
		System.out.println(w8.toString());
		
		


	}

}
