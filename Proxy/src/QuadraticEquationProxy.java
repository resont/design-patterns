
public class QuadraticEquationProxy implements Equation {
	
	private QuadraticEquation equation = new QuadraticEquation();
	private double a, b, c;
	private double[] result;

	@Override
	public String calculate(double a, double b, double c) {

		if(this.a == a && this.b == b && this.c == c) {
			System.out.print("Pobieranie wyniku z pamiêci:\t");
		}else {
			this.a = a;
			this.b = b;
			this.c = c;
			equation.calculate(a, b, c);
			result = equation.getResult();
			System.out.print("Obliczanie wyniku:\t\t");
		}

		return "x1 = "+result[0]+", x2 = "+result[1];
	}

}
