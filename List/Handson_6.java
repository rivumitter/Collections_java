import java.util.*;
public class Handson_6 {

	public static void main(String[] args) {

		Vector<String> vc = new Vector<String>();
		vc.add("January");
		vc.add("February");
		vc.add("March");
		vc.add("April");
		vc.add("May");
		vc.add("June");
		vc.add("July");
		vc.add("August");
		vc.add("September");
		vc.add("October");
		vc.add("November");
		vc.add("December");
		
		Iterator<String> itr = vc.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
