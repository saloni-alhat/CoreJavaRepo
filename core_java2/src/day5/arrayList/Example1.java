package day5.arrayList;

import java.util.*;

public class Example1 {
public static void main(String[] args) {
	ArrayList<String> transports= new ArrayList<String>();
	transports.add("AirLines");
	transports.add("Metro");
	transports.add("Bus");
	
	System.out.println("Transport availables are as follows: ");
	for(String trans:transports)
	{
		
		System.out.println(trans);
	}
}
}


