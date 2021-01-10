package day4.arrayLists;

import java.util.ArrayList;

public class Example3 {
public static void main(String[] args) {
	ArrayList<String> cars= new ArrayList<String>();
	cars.add("Volvo");
	cars.add("Ford");
	cars.add("Honda");
	cars.add("Hundai");
	
	for(String x:cars)
	{
		System.out.println(x);
	}
}
}
