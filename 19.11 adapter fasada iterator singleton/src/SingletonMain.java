
public class SingletonMain {
	
	public static class Singleton{   
		
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
		
		public void print2() {
			System.out.println("Test klasy print2");
		}
	}


	public static void main(String[] args) {
		
		Singleton sg = new Singleton();
		sg.print();
		sg.print2();
		
		Singleton sg2 = new Singleton();
		sg2.print();
		sg2.print2();

	}

}
