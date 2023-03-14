package AdapterPattern;

public class EmployeeCSVAdapter implements Employee {

	private EmployeeCSV instance;
	
	public EmployeeCSVAdapter(EmployeeCSV input) {
		this.instance=input;
	}
	
	public String getId() {
		// TODO Auto-generated method stub
		return instance.getEid()+"";
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return instance.getFirstName();
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return instance.getLastName();
	}

	public String getEmailAddress() {
		// TODO Auto-generated method stub
		return instance.getEmail();
	}
	
	@Override
	public String toString() {
		return this.getId()+this.getFirstName()+this.getLastName()+this.getEmailAddress();
	}

}
