package day4.arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Example6 {
	//adding of values in arrayList using scanner and loops
	public static void main(String[] args) {
		ArrayList<String> values=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		String val1=sc.next();
		String val2=sc.next();
		String val3=sc.next();
		
		values.add(val1);
		values.add(val2);
		values.add(val3);
		
		for(String x:values)
		{
			System.out.println(x);
		}
		
		
		
		
		
	}

}
