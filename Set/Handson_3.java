import java.util.*;

public class Handson_3 {

	public static void main(String[] args) {


		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("Arghya");
		ts.add("Antara");
		ts.add("Aratrika");
		ts.add("Subho");
		
		//Reverse & Iterate
		Iterator it = ts.descendingIterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		//checking
		Scanner sc = new Scanner(System.in);
		System.out.println("Entere name to search");
		String temp = sc.next();
		if(ts.contains(temp))
			System.out.println("Yes !!");
		else
			System.out.println("No!!");
		
		

	}

}
