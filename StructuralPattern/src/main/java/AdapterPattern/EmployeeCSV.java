package AdapterPattern;

import java.util.StringTokenizer;

public class EmployeeCSV {

	private int Eid;
	private String FirstName;
	private String LastName;
	private String Email;
	
	public EmployeeCSV (String input) {
		this.extractDetails(input);
	}

	private void extractDetails(String input) {
		// TODO Auto-generated method stub
		StringTokenizer tokenizer = new StringTokenizer(input,",");
		if(tokenizer.hasMoreElements()) {
			Eid = Integer.parseInt(tokenizer.nextToken());
		}
		if(tokenizer.hasMoreElements()) {
			FirstName = tokenizer.nextToken();
			
		}
		if(tokenizer.hasMoreElements()) {
			LastName= tokenizer.nextToken();
		}
		if(tokenizer.hasMoreElements()) {
			Email = tokenizer.nextToken();
		}
	}

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	
}
