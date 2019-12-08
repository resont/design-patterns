
public class Application extends Handler {
	
	public Application() {
		super();
	}
	
	public Application(Handler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void HandleHelp() {
		ShowHelp();
	}

	@Override
	public void ShowHelp() {
		System.out.println("Potrafiê obs³u¿yæ ¿¹danie, wyœwietlam pomoc");
	}

}
