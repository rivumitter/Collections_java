package Handson_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int empId;
		String empName,email,gender; 
		float salary;
		
		Employee employee = null;
		EmployeeDB employeeDB = new EmployeeDB();
		
		while(true)
		{
			System.out.println("1:Add Employee  2:Delete Employee 3:Show PaySlip 4:Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:System.out.println("empid:name:email:gender:salary");
						empId = sc.nextInt();
						sc.nextLine();
						empName = sc.nextLine();
						email = sc.nextLine();
						gender = sc.nextLine();
						salary = sc.nextFloat();
						sc.nextLine();
						employee = new Employee(empId, empName, email, gender, salary);
						employeeDB.addEmployee(employee);
						employee.GetEmployeeDetails();
						break;
				case 2:System.out.println("Enter employeeId whome you want to delete");
						empId = sc.nextInt();
						if(employeeDB.deleteEmployee(empId))
						System.out.println("Deleted!!");
						else
							System.out.println("Invalid Employee Id");
						break;
				case 3:	System.out.println("Enter EmpId whose PaySlip you want to check");
						empId = sc.nextInt();
						System.out.println(employeeDB.showPaySlip(empId));
						break;
				case 4: System.exit(0);
					
			}
			
		}

	}

}
