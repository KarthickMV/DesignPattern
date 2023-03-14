package AdapterPattern;

import java.util.List;

public class AdapterDemo {

	public static void main(String[] args) {
		EmployeeClient Client = new EmployeeClient();
		List<Employee> list = Client.getEmployeeList();
		System.out.println(list.toString());
	}
	
}
