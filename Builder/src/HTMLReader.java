public class HTMLReader {
	private String text;
	private TextConverter tc;
	
	public HTMLReader(String text) {
		this.text = text;
		tc = new StandardConverter();
	}
	
	public void SetParser(TextConverter tc) {
		this.tc = tc;
	}
	
	public String ParseHTML() {
		
		StringBuilder parsedText = new StringBuilder();
		
		int i = 0;
		while(i < text.length()) {
			char c = text.charAt(i);
			
			if(c != '<') {
				parsedText.append(c);
				i++;
			}else {
				StringBuilder tagBefore = new StringBuilder();
				StringBuilder tagAfter = new StringBuilder();
				while(text.charAt(i-1) != '>'){
					tagBefore.append(text.charAt(i));
					i++;
				}
				parsedText.append(tc.ConvertTag(tagBefore.toString()));
				
				while(text.charAt(i) != '<') {
					parsedText.append(tc.ConvertCharacter(text.charAt(i)));
					i++;
				}
				
				while(text.charAt(i-1) != '>'){
					tagAfter.append(text.charAt(i));
					i++;
				}
				parsedText.append(tc.ConvertTag(tagAfter.toString()));
				
			}
		}
		
		return parsedText.toString();
	}
}
