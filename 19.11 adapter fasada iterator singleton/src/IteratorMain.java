import java.util.ArrayList;
import java.util.Arrays;

public class IteratorMain {
	
	
	public abstract class Iterator<Type>{
		
		public abstract void First();
		public abstract void Next();
		public abstract boolean IsDone();
		public abstract Type CurrentItem();
		protected Iterator() {
		}
		
	}
	
	class ArrayIterator<Type> extends Iterator<Type>{
		
		private int currentIndex;
		ArrayList <Type> tab;
		
		public ArrayIterator(ArrayList<Type> t) {
			this.currentIndex = 0;
			tab = t;
		}
		
		@Override
		public void First() {
			this.currentIndex = 0;
		}
		
		@Override
		public void Next() {
			this.currentIndex++;
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
	
	class NonZeroArrayIterator<Type> extends Iterator<Type>{
		
		private int currentIndex;
		ArrayList <Type> tab;
		
		public NonZeroArrayIterator(ArrayList<Type> t) {
			this.currentIndex = 0;
			tab = t;
//			for(int i=t.size()-1;tab.get(i).equals(0);i--) {
//				tab.remove(i);
//			}
		}
		
		@Override
		public void First() {
			this.currentIndex = 0;
		}
		
		@Override
		public void Next() {
			this.currentIndex++;
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
	

	public static void main(String[] args) {
		IteratorMain it = new IteratorMain();

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,3,0,0,5,0,7,9,0,0));
		
		ArrayIterator<Integer> tab = it.new ArrayIterator<Integer>(numbers);
		
		for(tab.First();!tab.IsDone();tab.Next()) {
			System.out.print(tab.CurrentItem()+" ");
		}
		
		System.out.println();
		
		NonZeroArrayIterator<Integer> tab2 = it.new NonZeroArrayIterator<Integer>(numbers);
		
		for(tab2.First();!tab2.IsDone();tab2.Next()) {
			try {
				System.out.print(tab2.CurrentItem()+" ");
			}catch(IndexOutOfBoundsException e){
				break;
			}
			
		}
	}

}
