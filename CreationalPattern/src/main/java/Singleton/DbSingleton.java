package Singleton;

public class DbSingleton {

	private static volatile DbSingleton instance =null;
	
	private DbSingleton() {
		
		if(instance != null) {
			throw new RuntimeException("Use the getInstance method to get a DbSingleton Object");
		}
	}
	
	public static DbSingleton getInstance() {
		if(instance == null) {
			synchronized(DbSingleton.class) {
				if(instance == null) {					
					instance = new DbSingleton();
				}
			}
		}
		return instance;
	}
}
