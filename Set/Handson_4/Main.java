package Handson_4;

import Handson_1.Country;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country country = new Country();
		
		country.saveCountryname("India");
		country.saveCountryname("Usa");
		System.out.println(country.saveCountryname("New Zealand"));
		
		
		System.out.println(country.getCountry("Australia"));
		System.out.println(country.getCountry("India"));
	}

}
