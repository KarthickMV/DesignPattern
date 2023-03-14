package AdapterPattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {
		List<Employee> employees = new ArrayList<Employee>();
		Employee employeefromDB = new EmployeeDB("1234","Shivanna","Nagvekar","shivani@Boeing.com");		
		
		/*
		 * DBConnection connection = new DBConnection(); List<Employee> employeesfromDB
		 * = connection.getEmployees();
		 */
		
		employees.add(employeefromDB);
		
		EmployeeLDAP employeeFromLdap = new EmployeeLDAP("4321","Pi","Pi","pi@boeing.com");

		employees.add(new EmployeeLDAPAdapter(employeeFromLdap));
		
		EmployeeCSV employeeFromCSV = new EmployeeCSV("1234,Shivani,Mahendra,shivaniMahendra@boeing.com");
		
		employees.add(new EmployeeCSVAdapter(employeeFromCSV));
		return employees;
	}
	
}
