package MementoPattern;


//originator
public class Employee {
	
	private String name;
	private String address;
	private String phoneNumber;
	
	public Employee() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public EmployeeMemento save() {
		return new EmployeeMemento(name,phoneNumber);
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}

	public void revert(EmployeeMemento empMemento) {
		this.name = empMemento.getName();
		this.phoneNumber = empMemento.getPhoneNumber();
	}
}
