package day4.arrayLists;

import java.util.ArrayList;
import java.util.*;

public class Example8 {
//ArrayList of salaries(int)
	public static void main(String[] args) {
		ArrayList<Integer> salariesList=new ArrayList<Integer>();
		salariesList.add(15000);
		salariesList.add(16000);
		salariesList.add(10000);
		salariesList.add(5000);
		
		//Collections.sort(salariesList);
		Collections.sort(salariesList, Collections.reverseOrder());
		for(int x:salariesList)
		{
			System.out.println(x);
		}
		
	}
}
