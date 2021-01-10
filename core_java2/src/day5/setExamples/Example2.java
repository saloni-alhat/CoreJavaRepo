package day5.setExamples;

import java.util.*;

//Set of numbers using Iterator
public class Example2 {
	public static void main(String[] args) {
		Set<Integer> setOfIds=new HashSet<Integer>();
		
		setOfIds.add(34213);
		setOfIds.add(21342);
		setOfIds.add(54365);
		setOfIds.add(87123);
		
		Iterator<Integer> iter = setOfIds.iterator();
		while(iter.hasNext()) {
			int x= iter.next();
			System.out.println(x);
		}
	}

}
