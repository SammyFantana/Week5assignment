package Logger;

public class AsteriskLogger implements Logger{
	StringBuilder wordStar;
	String star = "";
	
	
	@Override
	public String Log(String word) {
		
		return "***" + word + "***";
	}

	@Override
	public String Error(String bad) {
		
		for(int i = 0; i < (bad.length() + 7); i++) {
			star = star + "*";
		}
		
		return 
				"***" + star + "***" +
				"\n***" + "ERROR: " + bad + "***"+
				"\n***" + star + "***"
					;
	}

}
