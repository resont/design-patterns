
public class SingletonMain {
	
	public static class Singleton{   
		
		private static Singleton instance;
		
		private Singleton() {
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


	public static void main(String[] args) {
		
		Singleton sg = new Singleton();
		sg.print();
		
		Singleton sg2 = new Singleton();
		sg2.print();

	}

}
