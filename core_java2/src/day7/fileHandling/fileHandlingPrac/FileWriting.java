package day7.fileHandling.fileHandlingPrac;

import java.io.*;

public class FileWriting {
	public static void main(String[] args) {
		try {
			FileWriter filterWriter=new FileWriter("demo.txt");
			filterWriter.write("Countries: \n");
			filterWriter.write("India\n");
			filterWriter.write("Australia\n");
			filterWriter.write("England\n");
			filterWriter.write("Africa\n");
			filterWriter.close();
			System.out.println("Successfull..");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
