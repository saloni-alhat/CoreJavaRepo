package day3.polymorphisms;
import java.util.*;
public class Square extends Shapes {
	public void calculateArea()
	{
		int side=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sides of Square");
		side =sc.nextInt();
		System.out.println("Area of Square: "+side*side);
		
	}

}
