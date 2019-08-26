package Handson_2;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeDB {

	ArrayList<Employee> al = new ArrayList<Employee>();
	
	boolean addEmployee(Employee e)
	{
		al.add(e);
		return true;
	}
	
	
	boolean deleteEmployee(int empId)
	{
		
		return al.removeIf(new Predicate<Employee>(){
			
			public boolean test(Employee e)
			{
				return e.empId == empId;
			}
			
		});
		
	}
	String showPaySlip(int empId)
	{
		String str = "";
		
		for(Employee emp : al)
		{
			if(emp.empId == empId)
				str = " Name: " + emp.empName + " Email: "+emp.email + " " +" Salary:" + emp.salary;
		}
		
		return str;
	}
}
