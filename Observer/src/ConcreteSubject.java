public class ConcreteSubject extends Subject {
	private boolean subjectState = true;
	
	public boolean GetState() {
		return subjectState;
	}
	public void SetState(boolean state) {
		subjectState = state;
	}
}
