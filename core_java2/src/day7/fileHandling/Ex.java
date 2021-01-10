package day7.fileHandling;
import java.io.*;
import java.util.Scanner;
public class Ex {
	public static void main(String[] args) throws IOException {
		File file = new File("append.txt");
		FileWriter fr = new FileWriter(file, true);
		BufferedWriter br = new BufferedWriter(fr);
		br.write("Java");

		br.close();
		fr.close();
			
	}
	
		
	}

