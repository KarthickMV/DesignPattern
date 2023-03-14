package MementoPattern;

public class EmployeeMemento {
	
	private String name;
	private String phoneNumber;
	
	//employee
	//new state - new name and the old phoneNumber - EmployeeMemento - v1
	//new state - old (linked to the previous state) name and new phoneNumber - EmployeeMemento -v2
	
	public EmployeeMemento(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	

}
