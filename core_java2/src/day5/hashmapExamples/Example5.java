package day5.hashmapExamples;

import java.util.*;


import day3.classes.Employee;

public class Example5 {
public static void main(String[] args) {
	Employee employee1=new Employee(1001,"David");
	Employee employee2=new Employee(1002,"John");
	Employee employee3=new Employee(1003,"Peter");
	Employee employee4=new Employee(1004,"Lisa");
	

	
	Map<Integer, Employee> mapOfEmployee= new HashMap<Integer,Employee>();
	mapOfEmployee.put(10,employee1);
	mapOfEmployee.put(24,employee2);
	mapOfEmployee.put(18,employee3);
	mapOfEmployee.put(40,employee4);
	
	Set<Integer> key = mapOfEmployee.keySet();
	for(int x:key)
	{
		Employee emp=mapOfEmployee.get(x);
		System.out.println(emp);
	}
	
}
}
