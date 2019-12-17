
public class File {
	
	private FileState state;
	
	public File() {
		state = new FileClosed();
	}
	
	public void Open() {
		state = state.Open();
	}
	
	public void Close() {
		state = state.Close();
	}
	
	public void Read() {
		state.Read();
	}
	
	public void Write() {
		state.Write();
	}

}
