import java.util.ArrayList;

public class ConcreteMediator implements Mediator {
	
	private ArrayList<ConcreteColleague> checkboxes = new ArrayList<>();
	
	@Override
	public void add(ConcreteColleague colleague) {
		checkboxes.add(colleague);
	}
	
	public void disableAll() {
		for(ConcreteColleague i: checkboxes) {
			i.setStatus(false);
		}
	}

	@Override
	public void selected(char select) {
		switch(select) {
			case '1':
				if(checkboxes.get(0).getStatus() == false)
					checkboxes.get(0).setStatus(true);
				else
					this.disableAll();
				break;
			case '2':
				if(checkboxes.get(1).getStatus() == false) {
					checkboxes.get(0).setStatus(true);
					checkboxes.get(1).setStatus(true);
				}else
					this.disableAll();
				break;
			case '3':
				if(checkboxes.get(2).getStatus() == false) {
					checkboxes.get(0).setStatus(true);
					checkboxes.get(1).setStatus(true);
					checkboxes.get(2).setStatus(true);
				}else
					this.disableAll();
				break;
			default:
				System.out.println("Nie ma takiej opcji!");
		}

	}
	@Override
	public void printMediators() {
		for(ConcreteColleague i: checkboxes) {
			System.out.println(i.getSelect());
		}
	}

}
