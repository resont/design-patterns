
public class QuadraticEquation implements Equation {

	private double[] result = new double[2];
	
	@Override
	public String calculate(double a, double b, double c) {
		double delta = (b * b) - (4 * a * c);
		
		
		result[0] = (-1 * b - Math.sqrt(delta)) / (2 * a);
		result[1] = (-1 * b + Math.sqrt(delta)) / (2 * a);
		
		return "x1 = "+result[0]+", x2 = "+result[1];
	}
	
	public double[] getResult() {
		return result;
	}

}
