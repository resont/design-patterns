
public class FileClosed implements FileState {

	@Override
	public FileState Open() {
		System.out.println("Otwieram plik");
		return new FileOpened();
	}

	@Override
	public FileState Close() {
		System.out.println("Plik ju¿ zamkniêty");
		return this;
	}

	@Override
	public void Read() {
		System.out.println("Plik zamkniêty - nie mogê czytaæ z pliku");

	}

	@Override
	public void Write() {
		System.out.println("Plik zamkniêty - nie mogê pisaæ do pliku");

	}
	

}
