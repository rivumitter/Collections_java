package Handson_2;

public class Employee {
	
	int empId;
	String empName,email,gender; 
	float salary;
	public Employee(int empId, String empName, String email, String gender, float salary) {
		
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.gender = gender;
		this.salary = salary;
	}
	
	void GetEmployeeDetails()
	{
		this.toString();
	}

	@Override
	public String toString() {
		return "Employee empId=" + empId + ", empName=" + empName + ", email=" + email + ", gender=" + gender
				+ ", salary=" + salary + "";
	}
	

}
