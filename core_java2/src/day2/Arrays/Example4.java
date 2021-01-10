package day2.Arrays;

public class Example4 {
public static void main(String[] args) {
	String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	System.out.println("Updating values.");
	cars[0]="Audi";
	cars[1]="Honda";
	for(String x:cars)
	{
		System.out.println(x);
	}
}
}
