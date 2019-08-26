import java.util.*;

public class Handson_3 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Arghya Mitra");
		al.add("anirban Kundu");
		al.add("Anilava Kundu");
		
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
