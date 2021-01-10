package day2.Arrays;

public class Example5 {
public static void main(String[] args) {
	//2-d array
	int [][] num= {{40,32,55},{23,35,61}};
	int[]firstArray=num[0];
	int[]secondArray=num[1];
	for(int i=0;i<firstArray.length;i++)
	{
		System.out.println(firstArray[i]);
	}
	System.out.println("*************************");
	for(int i=0;i<secondArray.length;i++)
	{
		System.out.println(secondArray[i]);
	}
	
	
}
}
