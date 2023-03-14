package AdapterPattern;

public class EmployeeLDAPAdapter implements Employee {
	
	private EmployeeLDAP input;

	public EmployeeLDAPAdapter(EmployeeLDAP Input) {
		this.input = Input;
	}
	
	public String getId() {
		// TODO Auto-generated method stub
		return input.getCn();
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return input.getFullName();
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return input.getSurname();
	}

	public String getEmailAddress() {
		// TODO Auto-generated method stub
		return input.getEmail();
	}

}
