package day5.setExamples;

import java.util.HashSet;
import java.util.Set;

import day3.classes.Employee;

public class Example5 {
public static void main(String[] args) {
	Employee employee1=new Employee(1001,"David");
	Employee employee2=new Employee(1002,"John");
	Employee employee3=new Employee(1003,"Peter");
	Employee employee4=new Employee(1004,"Lisa");
	
	Set<Employee> setOfEmployee=new HashSet<Employee>();
	setOfEmployee.add(employee1);
	setOfEmployee.add(employee2);
	setOfEmployee.add(employee3);
	setOfEmployee.add(employee4);
	

	for(Employee emp:setOfEmployee)
	{
		System.out.println(emp);
	}
}
}
