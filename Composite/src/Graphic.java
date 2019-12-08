interface Graphic{
	public void Draw();
	public void Add(Graphic gr);
	public void Remove(Graphic gr);
	public Graphic GetChild(int c);
}