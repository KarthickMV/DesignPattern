package Singleton;

public class DbSingletonDemo {

	public static void main(String[] args) {
		DbSingleton DemoInstance = DbSingleton.getInstance();
		System.out.println(DemoInstance);
		DbSingleton DemoInstance2 = DbSingleton.getInstance();
		System.out.println(DemoInstance2);

	}
	
}
