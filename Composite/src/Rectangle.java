class Rectangle implements Graphic{
	
	@Override
	public void Draw() {
		System.out.println("Rysuj� prostok�t");
	}

	@Override
	public void Add(Graphic gr) {
	}

	@Override
	public void Remove(Graphic gr) {
	}

	@Override
	public Graphic GetChild(int c) {
		return null;
	}
}