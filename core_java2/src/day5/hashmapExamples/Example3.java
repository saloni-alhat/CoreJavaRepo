package day5.hashmapExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Example3 {
//Use iterator to iterator over keyset
	public static void main(String[] args) {
		HashMap<Integer, String> mapOfCities= new HashMap<Integer,String>();
		
		mapOfCities.put(10,"Pune");
		mapOfCities.put(24,"Mumbai");
		mapOfCities.put(18,"Sydney");
		mapOfCities.put(40,"Malbourne");
		
		//System.out.println(mapOfCities);
		/*for (int x : mapOfCities.keySet()) {
		      System.out.println( x+": "+ mapOfCities.get(x));	
		  */   
		Set<Integer> keysSet = mapOfCities.keySet();
		Iterator<Integer> iter=keysSet.iterator();
		while(iter.hasNext())
		{
			int key=iter.next();
			String city=mapOfCities.get(key);
			System.out.println(key+": "+city);
		}

		
		
	}
}
