
public class Button extends Handler {
	
	public Button() {
		super();
	}
	
	public Button(Handler nextHandler) {
		super(nextHandler);
	}
	
	@Override
	public void HandleHelp() {
		System.out.println("Nie potrafiê obs³u¿yæ ¿¹dania i przekazujê je dalej");
		nextHandler.HandleHelp();
	}

	@Override
	public void ShowHelp() {
		
	}

}
