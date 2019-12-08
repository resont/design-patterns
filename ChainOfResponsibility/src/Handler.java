
public abstract class Handler {
	protected Handler nextHandler;
	
	protected Handler() {
		nextHandler = null;
	}
	
	protected Handler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	public abstract void HandleHelp();
	public abstract void ShowHelp();
	
	public void setNext(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
}
