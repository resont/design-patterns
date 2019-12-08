import java.util.ArrayList;

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