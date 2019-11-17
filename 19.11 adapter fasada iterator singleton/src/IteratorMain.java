import java.util.Iterator;

public class IteratorMain {
	
	public class Tab<Type> implements Iterable<Type> {
		private Type[] tab;
		private int size;
		
		public Tab(Type[] newTab) {
			tab = newTab;
			size = tab.length;
		}
		
		@Override
		public Iterator<Type> iterator() {
			Iterator<Type> iter = new Iterator<Type>() {
				
				private int i = 0;

				@Override
				public boolean hasNext() {
					if(i < size && tab[i] != null) {
						return true;
					}else {
						return false;
					}
				}

				@Override
				public Type next() {
					return tab[i++];
				}
				
			};
			return iter;
		}
		
 	}
	
	public class NonZeroTab<Type> implements Iterable<Type> {
		private Type[] tab;
		private int size;
		
		public NonZeroTab(Type[] newTab) {
			tab = newTab;
			size = tab.length;
		}
		
		@Override
		public Iterator<Type> iterator() {
			Iterator<Type> iter = new Iterator<Type>() {
				
				private int i = 0;

				@Override
				public boolean hasNext() {
					if(i < size && tab[i] != null) {
						return true;
					}else {
						return false;
					}
				}

				@Override
				public Type next() {
					if(tab[i].equals(0)) {
						i++;
					}
					return tab[i++];
				}
				
			};
			return iter;
		}
		
 	}

	public static void main(String[] args) {
		IteratorMain it = new IteratorMain();
		
		Integer[] numbers = new Integer[] {1,3,0,5,0,7,9};
		
		Tab<Integer> tab = it.new Tab<Integer>(numbers);
		
		for(Integer i: tab) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		NonZeroTab<Integer> tab2 = it.new NonZeroTab<Integer>(numbers);
		
		for(Integer i: tab2) {
			System.out.print(i+" ");
		}
		
		
	}

}
