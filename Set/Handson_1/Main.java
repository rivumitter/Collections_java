package Handson_1;
public class Main {

	public static void main(String[] args) {

		Country country = new Country();
		
		country.saveCountryname("India");
		country.saveCountryname("Usa");
		System.out.println(country.saveCountryname("New Zealand"));
		
		
		System.out.println(country.getCountry("Australia"));
		System.out.println(country.getCountry("India"));
		

	}

}
