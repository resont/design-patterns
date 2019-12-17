import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Mediator med = new ConcreteMediator();
		
		med.add(new ConcreteColleague("1. Æwiczenie zaliczone"));
		med.add(new ConcreteColleague("2. Wyk³ad (egzamin) zaliczony"));
		med.add(new ConcreteColleague("3. Przedmiot zaliczony (wygrany konkurs)"));
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			med.printMediators();
			System.out.println("4. Wyjœcie z programu");
			
			System.out.print("Wybierz opcje: ");
			char option = in.nextLine().charAt(0);
			if(option == '4')
				break;
			else
				med.selected(option);
			System.out.println();

		}
		in.close();


	}

}
