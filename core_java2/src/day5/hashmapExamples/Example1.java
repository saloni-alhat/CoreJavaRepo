package day5.hashmapExamples;

import java.util.HashMap;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
		HashMap<Integer, String> mapOfCities= new HashMap<Integer,String>();
		
		mapOfCities.put(10,"Pune");
		mapOfCities.put(24,"Mumbai");
		mapOfCities.put(18,"Sydney");
		mapOfCities.put(40,"Malbourne");
		
		//System.out.println(mapOfCities);
		for (int x : mapOfCities.keySet()) {
		      System.out.println( x+": "+ mapOfCities.get(x));	
		     
		/*Set<Integer> keysSet = mapOfCities.keySet();
		for(int x:keysSet) {
		String city = mapOfCities.get(x);
		System.out.println(city);
		*/
		
		
		
		
	}
	}
}
