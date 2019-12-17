
public class ConcreteColleague extends Colleague {
	private String select;
	private boolean status;
	
	public ConcreteColleague(String select) {
		this.select = select;
		status = false;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public String getSelect() {
		if(status)
			return select+"  X";
		else
			return select;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public void changed() {
		this.mediator.selected(select.charAt(0));

	}

	@Override
	public void set(Mediator mediator) {
		this.mediator = mediator;

	}

}
