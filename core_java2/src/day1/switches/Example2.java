package day1.switches;

public class Example2 {
	public static void main(String[] args) {
		char grade='B';
		switch(grade)
		{
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Passed");
			break;
		case 'D':
			System.out.println("Better try again");
				break;
		default:
			System.out.println("Invalid grade");
		}
		System.out.println("Your Grade is: " +grade);
	}
}
