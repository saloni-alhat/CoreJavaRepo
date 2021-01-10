package day7.fileHandling;

import java.io.File;

//delete the file
public class Example4 {
	 public static void main(String[] args) { 
		    File file = new File("course.txt"); 
		    boolean fileExists=file.exists();
		    if(fileExists)
		    {
		    	System.out.println("This File is exist");
		    	System.out.println("Now going to delete this file...");
		    	boolean deletionSuccessful=file.delete();
		    	if(deletionSuccessful)
		    	{
		    		System.out.println("File deleted successfully!!");
		    	}
		    
		    }else {
		    	System.out.println("This file does not exist");
		    }
		   
		  } 
}
