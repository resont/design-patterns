
public class SumVisitor implements Visitor {
	
	private double sum = 0;

	@Override
	public void Visit(Animal animal) {
		sum += animal.getPrice();
	}

	@Override
	public void VisitBird(Bird bird) {
		sum += bird.getPrice();
	}
	
	public double getSum() {
		return sum;
	}

}
