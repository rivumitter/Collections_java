package Handson_1;

import java.util.*;
public class Country {
	
	HashSet<String> H1 = new HashSet<String>();
	
	public HashSet<String> saveCountryname(String country)
	{
		H1.add(country);
		return H1;
	}
	
	public String getCountry(String country)
	{
		Iterator<String> itr = H1.iterator();
		
		while(itr.hasNext())
		{
			if(itr.next().equals(country))
				return country;
		}
		return null;
	}

}
