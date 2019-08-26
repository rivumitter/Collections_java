import java.util.*;

class Value{
	int i;
	float j;
	double k;
	public Value(int i, float j, double k) {
		this.i = i;
		this.j = j;
		this.k = k;
	}
	
}
public class Handson_4 {

	public static void main(String[] args) {
		ArrayList<Value> al = new ArrayList<Value>();
		int i;
		float j;
		double k;
		
		Scanner sc = new Scanner(System.in);
		
		i = sc.nextInt();
		j = sc.nextFloat();
		k = sc.nextDouble();
		
		//only int float dobl added...
		al.add(new Value(i, j, k));
		
		
		

	}

}
