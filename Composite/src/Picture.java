import java.util.ArrayList;
import java.util.List;

class Picture implements Graphic{
	
	private List<Graphic> graphics = new ArrayList<Graphic>();

	@Override
	public void Draw() {
		for(Graphic gr: graphics) {
			gr.Draw();
		}
	}

	@Override
	public void Add(Graphic gr) {
		graphics.add(gr);
	}

	@Override
	public void Remove(Graphic gr) {
		graphics.remove(gr);
	}

	@Override
	public Graphic GetChild(int c) {
		return graphics.get(c);
	}
	
}