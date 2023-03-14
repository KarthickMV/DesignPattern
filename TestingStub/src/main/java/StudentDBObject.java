
public class StudentDBObject {
	
	private String FirstName;
	private String MiddleName;
	private String LastName;
	private String Emailadress;
	private String yearOfEnrolling;
	private String department;
	private String PhoneNumber;
	private String RollNumber;
	private String yearOfPassing;
	
	
	
	public StudentDBObject(String firstName, String middleName, String lastName, String emailadress,
			String yearOfEnrolling, String department, String phoneNumber, String rollNumber, String yearOfPassing) {
		super();
		FirstName = firstName;
		MiddleName = middleName;
		LastName = lastName;
		Emailadress = emailadress;
		this.yearOfEnrolling = yearOfEnrolling;
		this.department = department;
		PhoneNumber = phoneNumber;
		RollNumber = rollNumber;
		this.yearOfPassing = yearOfPassing;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getMiddleName() {
		return MiddleName;
	}
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmailadress() {
		return Emailadress;
	}
	public void setEmailadress(String emailadress) {
		Emailadress = emailadress;
	}
	public String getYearOfEnrolling() {
		return yearOfEnrolling;
	}
	public void setYearOfEnrolling(String yearOfEnrolling) {
		this.yearOfEnrolling = yearOfEnrolling;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getRollNumber() {
		return RollNumber;
	}
	public void setRollNumber(String rollNumber) {
		RollNumber = rollNumber;
	}
	public String getYearOfPassing() {
		return yearOfPassing;
	}
	public void setYearOfPassing(String yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}
	

}
