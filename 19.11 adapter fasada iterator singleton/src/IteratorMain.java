import java.util.ArrayList;
import java.util.Arrays;

public class IteratorMain {
	
	
	public abstract class Iterator<Type>{
		ArrayList <Type> tab;
		public abstract void First();
		public abstract void Next();
		public abstract boolean IsDone();
		public abstract Type CurrentItem();
		
	}
	
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
	
	class NonZeroArrayIterator<Type> extends Iterator<Type>{
		
		private int currentIndex;
		
		public NonZeroArrayIterator(ArrayList<Type> t) {
			currentIndex = 0;
			tab = t;
//			for(int i=t.size()-1;tab.get(i).equals(0);i--) {
//				tab.remove(i);
//			}
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
	
	class dataStructure<Type>{
		ArrayList <Type> tab;
		public dataStructure(ArrayList<Type> t){
			tab = t;
		}
		
		public ArrayIterator<Type> arrayIterator() {
			return new ArrayIterator<Type>(tab);
		}
		
		public NonZeroArrayIterator<Type> nonZeroArrayIterator() {
			return new NonZeroArrayIterator<Type>(tab);
		}
		
	}
	
	public static void main(String[] args) {
		IteratorMain it = new IteratorMain();

		dataStructure<Integer> c = it.new dataStructure<Integer>(new ArrayList<Integer>(Arrays.asList(1,3,0,0,5,0,7,9,0,0)));
		
		ArrayIterator<Integer> tab = c.arrayIterator();
		NonZeroArrayIterator<Integer> tab2 = c.nonZeroArrayIterator();
	
		System.out.print("Tablica:\t");
		for(tab.First();!tab.IsDone();tab.Next()) {
			System.out.print(tab.CurrentItem()+" ");
		}
		
		System.out.println();
		System.out.print("Tablica bez 0:\t");
		for(tab2.First();!tab2.IsDone();tab2.Next()) {
			try {
				System.out.print(tab2.CurrentItem()+" ");
			}catch(IndexOutOfBoundsException e) {
				break;
			}
		}
	}

}
