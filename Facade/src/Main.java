
public class Main {

	public static void main(String[] args) {

		Wektor3D w1 = new Wektor3D(1, 2, 3);
		Wektor3D w2 = new Wektor3D(4, 5, 6);
		Wektor3D w3 = w1.add(w2);
		Wektor3D w4 = w1.multiply(3);

		System.out.println(w3.toString());
		System.out.println(w4.toString());
		
		System.out.println();
		
		Wektor2D w5 = new Wektor2D(3, 4);
		Wektor2D w6 = new Wektor2D(4, 5);
		Wektor2D w7 = w5.add(w6);
		Wektor2D w8 = w5.multiply(3);

		System.out.println(w7.toString());
		System.out.println(w8.toString());
		
		


	}

}
