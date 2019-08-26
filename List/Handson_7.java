import java.util.*;
class Employee{
	String id="",name="";
	int age;
	double salary;
	
	public Employee(String id, String name, int age, double salary) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
}
public class Handson_7 {

	public static void main(String[] args) {
		
		
		Vector<Employee> vc = new Vector<Employee>();
		String id="",name="";
		int age;
		double salary;
		
		Scanner sc = new Scanner(System.in);
		id = sc.nextLine();
		name = sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		salary = sc.nextDouble();
		
		vc.add(new Employee(id, name, age, salary));
		
		Iterator<Employee> itr = vc.iterator();
		while(itr.hasNext())
		{
			Employee employee = itr.next();
			System.out.println("Id: "+employee.id+" Name: "+employee.name+" Age: "+employee.age+" Salary: "
					+employee.salary);
		}
		
	}

}
