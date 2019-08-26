package Handson_1;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many Elements");
		
		int n = sc.nextInt();
		
		Country ob = new Country();
		int i = 0;
		
		while(n>0)
		{
			System.out.println("Enter country Name");
			String country = sc.next();
			System.out.println("Enter Capital");
			String capital = sc.next();
			
			ob.saveCountryCapital(country, capital);
			
			i++;
			n--;
		}
		System.out.println("Added....");
		
			System.out.println("Enter Country for getting the capitals");
			String con = sc.next();
			
			System.out.println(ob.getCapital(con));
			HashMap<String,String> hmp = new HashMap<String,String>();
			
			hmp = ob.createAnother();
			System.out.println("Creating another");
			hmp.entrySet().forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
			
			System.out.println("Country...");
			ArrayList<String> arr = ob.loopThrough();
			arr.forEach(e->System.out.println(e));	
			
	}

}
