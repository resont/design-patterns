
public class Main {

	public static void main(String[] args) {
		Handler anApplication = new Application();
		Handler aSaveDialog = new Dialog();
		Handler aPrintDialog = new Dialog();
		Handler aPrintButton = new Button();
		Handler anOKButton = new Button();
		
		aPrintButton.setNext(aPrintDialog);
		anOKButton.setNext(aPrintDialog);
		aPrintDialog.setNext(anApplication);
		aSaveDialog.setNext(anApplication);
		
		aPrintButton.HandleHelp();
		System.out.println();
		anOKButton.HandleHelp();
		System.out.println();
		aPrintDialog.HandleHelp();
		System.out.println();
		anApplication.HandleHelp();
		
	}

}
