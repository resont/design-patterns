public class TagWithUppercaseConverter implements TextConverter {

	@Override
	public char ConvertCharacter(char c) {
		return Character.toUpperCase(c);

	}

	@Override
	public String ConvertTag(String s) {
		return s;

	}

}
