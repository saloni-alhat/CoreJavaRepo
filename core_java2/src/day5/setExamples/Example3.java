package day5.setExamples;

import java.util.*;

//Set of numbers using Iterator
public class Example3 {
	public static void main(String[] args) {
		Set<String> countries=new HashSet<String>();
		
		countries.add("India");
		countries.add("PAK");
		countries.add("AUS");
		countries.add("ENG");
		
		for(String x: countries)
		{
			System.out.println(x);
		}
		}
	}

