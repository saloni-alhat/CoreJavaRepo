package day4.arrayLists;

import java.util.*;

public class Example9 {
public static void main(String[] args) {
	ArrayList<String> cars= new ArrayList<String>();
	cars.add("Volvo");
	cars.add("Ford");
	cars.add("Honda");
	cars.add("Hundai");
	Collections.sort(cars);
	//Collections.sort(cars, Collections.reverseOrder());

	
	for(String x:cars)
	{
		System.out.println(x);
	}
}
}
