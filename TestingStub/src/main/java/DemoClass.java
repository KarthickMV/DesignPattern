
public class DemoClass {
	
	public static void main(String[] args) {
		StudentDBObject student = StudentDirectoryInterface.getStudent();
		
		StudentInfo studentInfo = new StudentDBAdapter(student);
		
		System.out.println(studentInfo.getName() + studentInfo.getUsn());
		
	}

}
