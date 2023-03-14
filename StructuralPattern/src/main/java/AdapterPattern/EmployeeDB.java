package AdapterPattern;

public class EmployeeDB implements Employee{

	private String Id;
	private String FirstName;
	private String LastName;
	private String EmailAddress;
	
	
	public void setId(String id) {
		Id = id;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return this.Id;
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return this.FirstName;
	}

	public String getLastName() {
		// TODO Authisto-generated method stub
		return this.LastName;
	}

	public EmployeeDB(String id, String firstName, String lastName, String emailAddress) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		EmailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "EmployeeDB [Id=" + Id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", EmailAddress="
				+ EmailAddress + "]";
	}

	public String getEmailAddress() {
		// TODO Auto-generated method stub
		return this.EmailAddress;
	}

}
