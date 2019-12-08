public class FormatConverter implements TextConverter {

	@Override
	public char ConvertCharacter(char c) {
		return c;

	}

	@Override
	public String ConvertTag(String s) {
		String result = "";
		
		if(s.contains("/")) {
			result += "}";
		}else {
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i) == '<')
					result += "{";
				else if(s.charAt(i) == '>')
					result += "#";
				else
					result += s.charAt(i);
			}
		}
		
		return result;

	}

}
