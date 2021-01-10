package day2.practice;

public class Practice4 {
	
	 float calculateArea(float length, float breadth)
	{
		float area=length*breadth;
		System.out.println("Area of Rectangle is: "+area);
		return area;
	}
	  double calculateArea(double radius)
	{
		double area= Math.PI * (radius*radius);
		System.out.println("Area of circle is: "+area);
		return area;
	}
}
