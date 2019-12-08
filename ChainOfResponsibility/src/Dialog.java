
public class Dialog extends Handler {

	public Dialog() {
		super();
	}
	
	public Dialog(Handler nextHandler) {
		super(nextHandler);
	}
	
	@Override
	public void HandleHelp() {
		System.out.println("Nie potrafi� obs�u�y� ��dania i przekazuj� je dalej");
		nextHandler.HandleHelp();
	}

	@Override
	public void ShowHelp() {
		
	}

}
