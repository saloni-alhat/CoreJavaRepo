package day2.practice;

public class Practice7 {
public static void main(String[] args) {
	int[] salaries = {20000, 25000, 55000, 47000, 38000};
	int flag=0;
	//int salaryToFind = 55000;
	int len=salaries.length;
	for(int i=0;i<len;i++)
	{
		if(salaries[i]==55000)
		{
			System.out.println("Salary is Found at: "+i);
			flag=1;
			break;
	   }
	}
	if(flag==0)
		   System.out.println("Salary not found..");
	
}
}
