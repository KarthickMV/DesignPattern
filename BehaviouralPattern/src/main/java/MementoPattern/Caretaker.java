package MementoPattern;

import java.util.Stack;

public class Caretaker {

	private Stack<EmployeeMemento> employeeHistory = new Stack<EmployeeMemento>();
	
	public void save(Employee emp) {
		employeeHistory.push(emp.save());	
	}
	
	public void revert(Employee emp) {
		emp.revert(employeeHistory.pop());
	}
	
	//v4 - EmployeeMemento
	//v3
	//v2
	//v1
	
}
