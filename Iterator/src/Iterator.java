import java.util.ArrayList;

public abstract class Iterator<Type>{
	ArrayList <Type> tab;
	public abstract void First();
	public abstract void Next();
	public abstract boolean IsDone();
	public abstract Type CurrentItem();
		
	}
