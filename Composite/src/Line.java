class Line implements Graphic{
	
	@Override
	public void Draw() {
		System.out.println("Rysujê liniê");
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