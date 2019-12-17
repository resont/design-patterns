
//BM = black market
public class BMSumVisitor implements Visitor {
	
	private double sum = 0;

	@Override
	public void Visit(Animal animal) {
		sum += animal.getPrice();
	}

	@Override
	public void VisitBird(Bird bird) {
		sum += bird.getBMPrice();
	}
	
	public double getSum() {
		return sum;
	}

}
