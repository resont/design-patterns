import java.util.ArrayList;

public class Subject {
	private ArrayList<Observer> observers = new ArrayList<>();
	
	public void Attach(Observer o) {
		observers.add(o);
	}
	
	public void Detach(Observer o) {
		observers.remove(o);
	}
	
	public void Notify() {
		for(Observer i: observers) {
			i.Update(this);
		}
	}
}
