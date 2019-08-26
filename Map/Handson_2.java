import java.util.*;
public class Handson_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hmp = new HashMap<Integer, String>();
		
		hmp.put(1,"India");
		hmp.put(2,"Usa");
		hmp.put(3,"japan");
		hmp.put(4,"");
		
		//checking a key
		int chk = 2;
		
		if(hmp.containsKey(chk))
			System.out.println("Key is present");
		else
			System.out.println("Key not present");
		
		chk = 5;
		if(hmp.containsKey(chk))
			System.out.println("Key is present");
		else
			System.out.println("Key not present");
		
		//chk for value...
		
		chk = 4;
		if(hmp.get(chk).equals(""))
			System.out.println("Value doesnt exsits");
		else
			System.out.println("value exsits");
		
		//loop
		hmp.entrySet().forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
		
		
		

	}

}
