package day7.fileHandling;

import java.io.*;

public class Example1 {

	public static void main(String[] args) {
		try
		{
			File file=new File("course.txt");
			//File file=new File("D:\\course.txt");
			boolean result=file.createNewFile();
			if(result)
			{
				System.out.println("File Successfully got created: "+file.getName());	
			}	
			else
			{
				System.out.println("File already exist");
			}
		}catch(Exception e)
		{
			System.out.println("Exception Occured: "+e);
		}
	}
}
