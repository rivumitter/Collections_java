import java.math.BigInteger;
import java.util.HashMap;

public class Handson_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, BigInteger> hmp = new HashMap<String, BigInteger>();
		
		hmp.put("Arghya",new BigInteger("8910853648"));
		hmp.put("Anirban",new BigInteger("8911853678"));
		hmp.put("Arnab",new BigInteger("89108538918"));
		
		hmp.entrySet().forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
		

	}

}
