package day7.fileHandling.fileHandlingPrac;
import java.io.*;
public class Example1 {
public static void main(String[] args) {
	
	try
	{
		File file=new File("demo.txt");
		boolean res=file.createNewFile();
		if(res)
		{
			System.out.println("File Successfully got created: "+file.getName());	
		}	
		else
		{
			System.out.println("File already exist");
		}
	}catch(Exception e)
	{
		System.out.println("Errot occured: "+e.getMessage());
	}
}
}
