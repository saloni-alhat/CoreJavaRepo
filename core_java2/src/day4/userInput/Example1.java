package day4.userInput;
import java.util.Scanner;  // Import the Scanner class
public class Example1 {
	
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

		    System.out.println("Enter name, age and salary:");

		    // String input
		    String name = sc.nextLine();

		    // Numerical input
		    int age = sc.nextInt();
		    double salary = sc.nextDouble();

		    // Output input by user
		    System.out.println("Name: " + name);
		    System.out.println("Age: " + age);
		    System.out.println("Salary: " + salary);
	  }
	}

