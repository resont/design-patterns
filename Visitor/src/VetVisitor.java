
public class VetVisitor implements Visitor {

	@Override
	public void Visit(Animal animal) {
		if(!animal.getHealthy())
			System.out.println("Odwiedzone zwierzê: "+animal.getType()+". Diagnoza: choroba. Leczenie: antybiotyk, dieta.");
		else
			System.out.println("Odwiedzone zwierzê: "+animal.getType()+". Diagnoza: zdrowy.");
	}

	@Override
	public void VisitBird(Bird bird) {
		if(!bird.getHealthy()) {
			if(bird.getBMPrice() > 2*bird.getPrice()) {
				System.out.println("Odwiedzone zwierzê: "+bird.getType()+". Diagnoza: choroba. Leczenie: dok³adne badania i profesjonalne leczenie.");
			}else {
				System.out.println("Odwiedzone zwierzê: "+bird.getType()+". Diagnoza: choroba. Leczenie: antybiotyk, dieta.");
			}
		}else {
			System.out.println("Odwiedzone zwierzê: "+bird.getType()+". Diagnoza: zdrowy.");
		}
	}

}
