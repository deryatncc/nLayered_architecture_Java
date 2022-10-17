package nLayered.core;

public class JdbcLogger implements Logger {

	@Override
	public void logToSystem(String message) {
		System.out.println("Logged to JDBC :  " + message);
		
	}

}
