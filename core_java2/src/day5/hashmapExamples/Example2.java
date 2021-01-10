package day5.hashmapExamples;

import java.util.*;

public class Example2 {

	public static void main(String[] args) {
		Map<String, String> mapOfCities= new HashMap<String,String>();
		mapOfCities.put("Pune","Maharashtra");
		mapOfCities.put("gandhinagar","gujrat");
		mapOfCities.put("nagpur","Maharashtra");
		mapOfCities.put("hyderabad","telangana");
		
		//System.out.println(mapOfCities);
		
		/*for (String key : mapOfCities.keySet()) {
		      System.out.println( key+": "+ mapOfCities.get(key));	
		      */
		Set<String> keysSet = mapOfCities.keySet();
		for(String x:keysSet) {
		String city = mapOfCities.get(x);
		System.out.println(x+": "+city);
	}
	}
}
