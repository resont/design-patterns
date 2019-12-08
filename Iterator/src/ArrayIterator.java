import java.util.ArrayList;

class ArrayIterator<Type> extends Iterator<Type>{
	
	private int currentIndex;
	
	public ArrayIterator(ArrayList<Type> t) {
		currentIndex = 0;
		tab = t;
	}
	
	@Override
	public void First() {
		currentIndex = 0;
	}
	
	@Override
	public void Next() {
		currentIndex++;
	}
	
	@Override
	public boolean IsDone() {
		return currentIndex >= tab.size();
	}
	
	@Override
	public Type CurrentItem() {
		if(IsDone()) {
			return null;
		}
		return tab.get(currentIndex);
	}
}