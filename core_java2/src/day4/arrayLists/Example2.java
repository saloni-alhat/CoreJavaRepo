package day4.arrayLists;

import java.util.ArrayList;

public class Example2 {
public static void main(String[] args) {
	ArrayList<String> cars= new ArrayList<String>();
	cars.add("Volvo");
	cars.add("Ford");
	cars.add("Honda");
	cars.add("Hundai");
	
	for(int i=0;i<cars.size();i++)
	{
		String car=cars.get(i);
		System.out.println(car);
	}
}
}
