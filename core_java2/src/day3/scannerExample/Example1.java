package day3.scannerExample;
import java.util.Scanner;
public class Example1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username: ");
		String userName= sc.nextLine();
		System.out.println("Enter Age: ");
		int age=sc.nextInt();
		System.out.println("Username: "+userName+"\nAge: "+age);
		
	}

}
