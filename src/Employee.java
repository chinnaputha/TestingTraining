
public class Employee {

	// variables/data members
	int empId;
	String empName="Ashok";
	String company="Microsoft";

	// methods
	public void employeeId() {
		System.out.println("my emp id");
	}

	public void employeeName() {
		System.out.println("my emp Name");
	}

	
	//main
	public static void main(String[] args) {
		
		Employee ee = new Employee();//creating object of the class i.e. Employee
		System.out.println("Employee Name-->"+ee.empName);
		System.out.println("Employee Company-->"+ee.company);
	
		
		ee.employeeId();
	
		

	}

}
