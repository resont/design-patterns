
public interface FileState {
	
	FileState Open();
	FileState Close();
	void Read();
	void Write();
	
}
