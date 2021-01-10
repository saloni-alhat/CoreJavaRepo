package day5.setExamples;

import java.util.*;

//Set of numbers using Iterator
public class Example4 {
	public static void main(String[] args) {
		Set<String> countries=new HashSet<String>();
		
		countries.add("India");
		countries.add("Pakistan");
		countries.add("Australia");
		countries.add("England");
		
		Iterator<String> iter = countries.iterator();
		while(iter.hasNext()) {
			String x= iter.next();
			System.out.println(x);
		}
	}
}

