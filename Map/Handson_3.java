import java.util.*;
public class Handson_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> htb = new Hashtable<>();
		
		htb.put("West Bengal","Kolkata");
		htb.put("Oddisa","Cuttak");
		htb.put("Assam","Dispur");
		htb.put("Sikkim","Gangktok");
		htb.put("Gujrat","Ahemedabad");
		
		htb.entrySet().forEach(e->System.out.println("State: "+e.getKey()+" Capital: "+e.getValue()));
	}

}
