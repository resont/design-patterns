
public class Dialog extends Handler {

	public Dialog() {
		super();
	}
	
	public Dialog(Handler nextHandler) {
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
