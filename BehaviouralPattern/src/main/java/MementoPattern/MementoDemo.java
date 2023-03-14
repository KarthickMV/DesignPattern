package MementoPattern;

public class MementoDemo {
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		Caretaker caretaker = new Caretaker();
		employee.setName("Pillie");
		employee.setPhoneNumber("9035299563");
		employee.setAddress("Bangalore");
		caretaker.save(employee);
		
		System.out.println("Before making changes to our emploee object"+employee);
		
		employee.setName("Pillauuuuuuu");
		caretaker.save(employee);
		System.out.println("After making 1st changes to our emploee object"+employee);

		
		employee.setName("Pikachu");
		System.out.println("After making 2nd changes to our emploee object"+employee);
		caretaker.revert(employee);
		System.out.println("Employee object after reverting the changes 1st time"+employee);
		caretaker.revert(employee);
		System.out.println("Employee object after reverting the changes 2nd time"+employee);

	}

}
