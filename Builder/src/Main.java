
public class Main {

	public static void main(String[] args) {
		String text = "A<b>l</b>a ma <i>k</i>o<u>t</u>a";
		
		HTMLReader htmlReader = new HTMLReader(text);
		
		Config conf = new Config();
		TextConverter standard = conf.getConverter(new StandardConverter());
		TextConverter uppercase = conf.getConverter(new UppercaseConverter());
		TextConverter tagWithUppercase = conf.getConverter(new TagWithUppercaseConverter());
		TextConverter format = conf.getConverter(new FormatConverter());
		
		htmlReader.SetParser(standard);
		System.out.println(htmlReader.ParseHTML());
		
		htmlReader.SetParser(uppercase);
		System.out.println(htmlReader.ParseHTML());
		
		htmlReader.SetParser(tagWithUppercase);
		System.out.println(htmlReader.ParseHTML());
		
		htmlReader.SetParser(format);
		System.out.println(htmlReader.ParseHTML());
	}

}
