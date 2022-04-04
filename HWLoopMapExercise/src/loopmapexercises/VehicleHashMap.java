package loopmapexercises;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
//import java.util.TreeMap;
//import java.util.ArrayList;

public class VehicleHashMap {
	public static void main(String[] args) {

		try (/* You are a car dealer. Create a hash map of vehicles.
				 *The model is the Key, the make is the Value.
				 *Ask the customer what car (model) they are looking for. Use the Hash Map to determine if you have that vehicle, and what make it is.
				 *(e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")
				 */
		Scanner input = new Scanner(System.in)) {
			HashMap<String, String> vehicles = new HashMap<>();

			//TreeMap<String, String> vehicles = new TreeMap<>(); {
			//String[] modelKey = {"WRX STI","Forester","Aventador","Diablo","G-Wagon","C-Class","Civic","CRV","Giulia","Alfetta"};
			//String[] makeValue = {"Subaru","Lamborghini","Mercedes","Honda","Alfa Romeo"};
			//}
		    String modelKey = "";
		    String makeValue = "";

			vehicles.put("wrx sti","Subaru");
			vehicles.put("forester","Subaru");
			vehicles.put("crosstek","Subaru");
			vehicles.put("impreza rb320","Subaru");
			vehicles.put("aventador","Lamborghini");
			vehicles.put("diablo","Lamborghini");
			vehicles.put("g-wagon","Mercedes");
			vehicles.put("c-class","Mercedes");
			vehicles.put("discovery","Land Rover");
			vehicles.put("model t","Ford");
			vehicles.put("1933 5th wheel self parking car","Packard");
			vehicles.put("roma","Ferrari");
			vehicles.put("718 spider","Porsche");
			vehicles.put("r8 spyder","Audi");
			vehicles.put("8c","Alfa Romeo");
			vehicles.put("giulia","Alfa Romeo");
			vehicles.put("alfetta","Alfa Romeo");
			vehicles.put("rv schoolbus conversion","Blue Bird");
			vehicles.put("tacozilla","Toyota");

			//	for(loooooop) 

			System.out.println("What is the model of car are you looking for?");
			modelKey = input.nextLine();
			modelKey = modelKey.toLowerCase();

				if (vehicles.containsKey(modelKey) == true) {
					makeValue = vehicles.get(modelKey);
					System.out.println("Here is our matching available " + makeValue + " selection.");
				//loop through the hash map and return each key/value pair
				for (Map.Entry<String, String> entry : vehicles.entrySet()){
					String key = entry.getKey();
					String value = entry.getValue();
					if (value == makeValue){
					System.out.println(key.toUpperCase());
					}
					}
				}
				else
				{
					System.out.println("Sorry, unfortunately we dont have that specific make and model car in our current inventory.");
				}
		}
	}
}