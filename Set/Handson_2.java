import java.util.*;
public class Handson_2 {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		
		String[] str = {"Arghya","Antara","Anirban","Anish","Rivu","Arghya"};
		
		for(String s : str)
		{
			hs.add(s);
		}
		
		Iterator<String> itr = hs.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
