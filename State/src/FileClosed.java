
public class FileClosed implements FileState {

	@Override
	public FileState Open() {
		System.out.println("Otwieram plik");
		return new FileOpened();
	}

	@Override
	public FileState Close() {
		System.out.println("Plik ju� zamkni�ty");
		return this;
	}

	@Override
	public void Read() {
		System.out.println("Plik zamkni�ty - nie mog� czyta� z pliku");

	}

	@Override
	public void Write() {
		System.out.println("Plik zamkni�ty - nie mog� pisa� do pliku");

	}
	

}
