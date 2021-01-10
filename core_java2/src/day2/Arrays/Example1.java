package day2.Arrays;

public class Example1 {
public static void main(String[] args) {
	String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	/*System.out.println(cars[0]);
	System.out.println(cars[1]);
	System.out.println(cars[2]);
	System.out.println(cars[3]);
	*/
	int len=cars.length;
	System.out.println(len);
	for(int i=0;i<len;i++)
	{
		String s=cars[i];
		System.out.println(s);
	}
	
}
}
