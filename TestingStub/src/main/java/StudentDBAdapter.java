
public class StudentDBAdapter implements StudentInfo {

	private StudentDBObject instance;
	
	public StudentDBAdapter(StudentDBObject instance) {
		this.instance = instance;
	}
	
	public String getName() {
		// TODO Auto-generated method stub
		return instance.getFirstName()+" "+instance.getMiddleName()+" "+instance.getLastName();
	}

	public String getUsn() {
		// TODO Auto-generated method stub
		return instance.getYearOfPassing()+instance.getDepartment()+instance.getRollNumber();
	}

}
