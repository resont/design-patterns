
public class Main {

	public static void main(String[] args) {
		
		SumVisitor sum = new SumVisitor();
		BMSumVisitor bmSum = new BMSumVisitor();
		VetVisitor vet = new VetVisitor();
		
		Animal[] animals = {
				new Fish(80, false),
				new Reptile(150, true),
				new Mammal(250, true),
				new Bird(170, 230, false),
				new Bird(200, 500, false)
		};
		
		for(Animal i: animals) {
			System.out.println(i.show());
			i.Accept(sum);
			i.Accept(bmSum);
		}
		
		System.out.println("£¹czna wartoœæ zwierz¹t: "+sum.getSum());
		System.out.println("£¹czna wartoœæ zwierz¹t na czarnym rynku: "+bmSum.getSum());
		
		for(Animal i: animals) {
			i.Accept(vet);
		}
	}

}
