package Handson_4;
import java.util.*;
public class Country {

		TreeSet<String> ts = new TreeSet<String>();
		
		public void saveCountryNames(String names)
		{
			ts.add(names);
		}
		
		public String getCountryNames(String names)
		{
			Iterator<String> itr = ts.iterator();
			
			while(itr.hasNext())
			{
				if(itr.next().equals(names))
					return names;
			}
			return null;
		}
}
