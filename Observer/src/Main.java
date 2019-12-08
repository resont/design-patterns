public class Main {

	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		
		Observer ob1 = new ConcreteObserver(subject);
		Observer ob2 = new ConcreteObserver(subject);
		
	
		subject.Notify();
	}

}
