package day7.fileHandling;

import java.io.*;

public class Example2 {

	public static void main(String[] args) {
		
		try
		{
			FileWriter fileWriter=new FileWriter("course.txt");
			fileWriter.write("Core Java\n");
			fileWriter.write("Python\n");
			fileWriter.write("Advanced Java\n");
			fileWriter.append("C \n");
			
			fileWriter.close();
			System.out.println("Successfully wrote in File");
		}catch(Exception e)
		{
			System.out.println("Exception Occured: "+e);
		}
	}
}
