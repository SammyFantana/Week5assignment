package Logger;

public class app {

	public static void main(String[] args) {
		

		
		// TODO Auto-generated method stub
		AsteriskLogger starLog = new AsteriskLogger();
		AsteriskLogger starError = new AsteriskLogger();
		SpacedLogger spacedLog = new SpacedLogger();
		SpacedLogger spacedError = new SpacedLogger();
		
		System.out.println(starLog.Log("apple"));
		System.out.println(starLog.Error("fish"));
		System.out.println(spacedLog.Log("sword"));
		System.out.println(spacedLog.Error("cat"));
	}

}
