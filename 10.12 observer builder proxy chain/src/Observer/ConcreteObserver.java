package Observer;

public class ConcreteObserver implements Observer {
	private Subject subject = null;
	
	public ConcreteObserver(Subject subject) {
		this.subject = subject;
		this.subject.Attach(this);
	}
	
	@Override
	public void Update(Subject changed) {
		System.out.println("Odebrano ¿¹danie");
	}

}
