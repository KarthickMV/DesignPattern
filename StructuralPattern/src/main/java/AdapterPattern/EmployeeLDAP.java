package AdapterPattern;

public class EmployeeLDAP {
 
	private String cn;
	private String Surname;
	private String FullName;
	private String Email;
	public String getCn() {
		return cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public EmployeeLDAP(String cn, String surname, String fullName, String email) {
		super();
		this.cn = cn;
		Surname = surname;
		FullName = fullName;
		Email = email;
	}
	
	
}
