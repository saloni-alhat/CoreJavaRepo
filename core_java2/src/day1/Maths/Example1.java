package day1.Maths;

public class Example1 {
public static void main(String[] args) {
	int result=Math.max(29, 51);
	System.out.println("Maximum value");
	System.out.println(result);
	int result2=Math.min(29, 51);
	System.out.println("Minimum value");
	System.out.println(result2);
	
	double result3=Math.sqrt(64);
	System.out.println("Square root");
	System.out.println(result3);
	
	System.out.println("Absolute value");
	int result4=Math.abs(-6);
	System.out.println(result4);
	
	System.out.println("Random value");
	double result5=Math.random();//0.0 to 1.0
	System.out.println(result5);
	
	int randomNum = (int)(Math.random() * 101);  // 0 to 100
	System.out.println(randomNum);
}
}
