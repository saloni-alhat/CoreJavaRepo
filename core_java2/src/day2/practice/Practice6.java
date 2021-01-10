package day2.practice;

public class Practice6 {
public static void main(String[] args) {
	int []marks= {60,85,66,80,90};
	int len=marks.length,sum=0;
	for(int i=0;i<len;i++)
	{
		sum+=marks[i];
	}
	System.out.println("Sum: "+sum);
	System.out.println("Average: " +sum/5);
	
}
}
