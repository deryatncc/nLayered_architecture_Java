package nLayered.core;

public class HibernateLogger implements Logger {

	@Override
	public void logToSystem(String message) {
		System.out.println("Logged to Hibernate :  " + message);
		
	}

}
