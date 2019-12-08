import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {

		dataStructure<Integer> c = new dataStructure<Integer>(new ArrayList<Integer>(Arrays.asList(1,3,0,0,5,0,7,9,0,0)));
		
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
