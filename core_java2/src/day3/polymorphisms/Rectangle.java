package day3.polymorphisms;

import java.util.Scanner;

public class Rectangle extends Shapes {
	public void calculateArea()
	{
		int length=0, breadth=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sides of Rectangle(Length&Breadth)");
		length =sc.nextInt();
		breadth =sc.nextInt();
		System.out.println("Area of Rectangle: "+length*breadth);
		
	}

}
