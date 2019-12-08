public class Singleton {
	private static Singleton instance;
	
	protected Singleton() {
		System.out.println("Tworzenie singletona");
	}
	
	public static Singleton Instance() {
		if(instance==null) {		
			instance = new Singleton();       
		}
		
		return instance;   
	}
	
	public void print() {
		System.out.println("Test klasy print");
	}
}
