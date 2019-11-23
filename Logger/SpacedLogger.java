package Logger;

public class SpacedLogger implements Logger {
	String spacedWordLog = "";
	String spacedWordError = "";
	@Override
	public String Log(String word) {
		for (int i = 0; i < word.length(); i++) {
			spacedWordLog += word.charAt(i) + " ";
			
		}
		return spacedWordLog;
	}

	@Override
	public String Error(String bad) {
		for (int i = 0; i < bad.length(); i++) {
			spacedWordError += bad.charAt(i) + " ";		
		}
		return "ERROR: " + spacedWordError;
	}
		
}
