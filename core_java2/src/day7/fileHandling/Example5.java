package day7.fileHandling;

import java.io.File;

//creating a folder and then delete
public class Example5 {
	public static void main(String[] args) {
		File folder = new File("D:\\Test1");
		folder.mkdir();
		boolean result=folder.exists();
		if(result)
		{
			System.out.println("Folder name Test1 Exisst");
			System.out.println("Now we are going to delete it..");
			folder.delete();
			System.out.println("Deleted successfully");
		}else {
			System.out.println("Folder does not exist");
		}
	}
}
