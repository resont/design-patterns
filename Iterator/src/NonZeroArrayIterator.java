import java.util.ArrayList;

class NonZeroArrayIterator<Type> extends Iterator<Type>{
	
	private int currentIndex;
	
	public NonZeroArrayIterator(ArrayList<Type> t) {
		currentIndex = 0;
		tab = t;
//		for(int i=t.size()-1;tab.get(i).equals(0);i--) {
//			tab.remove(i);
//		}
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
		
		while(tab.get(currentIndex).equals(0)) {
			Next();
		}
		
		if(IsDone()) {
			return null;
		}
		
		return tab.get(currentIndex);
	}
}
	
