import java.util.ArrayList;
import java.util.List;

public class CompositeMain {

	public static void main(String[] args) {
		
		Graphic graphic = new Picture();
		graphic.Add(new Text());
		graphic.Add(new Line());
		graphic.Add(new Rectangle());
		Picture picture = new Picture();
		picture.Add(new Rectangle());
		picture.Add(new Line());
		graphic.Add(picture);
		graphic.Draw();
	}

}

interface Graphic{
	public void Draw();
	public void Add(Graphic gr);
	public void Remove(Graphic gr);
	public Graphic GetChild(int c);
}

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

class Rectangle implements Graphic{
	
	@Override
	public void Draw() {
		System.out.println("Rysujê prostok¹t");
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

class Text implements Graphic{
	
	@Override
	public void Draw() {
		System.out.println("Rysujê text");
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