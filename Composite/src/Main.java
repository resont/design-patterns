public class Main {

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
