
public class FileOpened implements FileState {

	@Override
	public FileState Open() {
		System.out.println("Plik ju¿ otwarty");
		return this;
	}

	@Override
	public FileState Close() {
		System.out.println("Zamykam plik");
		return new FileClosed();
	}

	@Override
	public void Read() {
		System.out.println("Czytam z pliku");

	}

	@Override
	public void Write() {
		System.out.println("Piszê do pliku");

	}

}
