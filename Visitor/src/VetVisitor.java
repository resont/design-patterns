
public class VetVisitor implements Visitor {

	@Override
	public void Visit(Animal animal) {
		if(!animal.getHealthy())
			System.out.println("Odwiedzone zwierz�: "+animal.getType()+". Diagnoza: choroba. Leczenie: antybiotyk, dieta.");
		else
			System.out.println("Odwiedzone zwierz�: "+animal.getType()+". Diagnoza: zdrowy.");
	}

	@Override
	public void VisitBird(Bird bird) {
		if(!bird.getHealthy()) {
			if(bird.getBMPrice() > 2*bird.getPrice()) {
				System.out.println("Odwiedzone zwierz�: "+bird.getType()+". Diagnoza: choroba. Leczenie: dok�adne badania i profesjonalne leczenie.");
			}else {
				System.out.println("Odwiedzone zwierz�: "+bird.getType()+". Diagnoza: choroba. Leczenie: antybiotyk, dieta.");
			}
		}else {
			System.out.println("Odwiedzone zwierz�: "+bird.getType()+". Diagnoza: zdrowy.");
		}
	}

}
