
public class Button extends Handler {
	
	public Button() {
		super();
	}
	
	public Button(Handler nextHandler) {
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
