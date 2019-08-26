package Handson_5;
import java.util.*;
public class Country {
	
	
	TreeMap<String,String> M1 = new TreeMap<String,String>();
	
	
	
	public TreeMap<String,String> saveCountryCapital(String Countryname,String Capital)
	{
		M1.put(Countryname, Capital);
		return M1;
	}
	
	public String getCapital(String Countryname)
	{
		if(M1.containsKey(Countryname))
		return M1.get(Countryname);
		else
			return "This Country is not Present";
	}
	
	public TreeMap<String,String> createAnother()
	{
		TreeMap<String,String> M2 = new TreeMap<String,String>();
		
		M1.entrySet().forEach(entry->{
			String key = entry.getValue();
			String value = entry.getKey();
			M2.put(key, value);
		});
		
		return M2;
	}
	
	public ArrayList<String> loopThrough()
	{
		ArrayList<String> arr = new ArrayList<String>();
		
		M1.entrySet().forEach(e->{
			arr.add(e.getKey());
		});
		
		return arr;
	}

}
