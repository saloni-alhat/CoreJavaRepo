package day4.abstraction.abstractionPractice;

import java.util.Scanner;

public class TestAirLine {
	public static void main(String[] args) {
		AirLine air=new Reservation();
		air.airLine();
		air.reservation();
		Scanner sc4=new Scanner(System.in);
		System.out.println("Confirm your AirLine Reservation(Yes/No): ");
		String confirm=sc4.nextLine();
		
		if(confirm.equalsIgnoreCase("Yes"))
		{
			System.out.println("Congratulation! Reservation Done.");
		}else
		{
			air.reservation();
		}
		
		System.out.println("Do you want further AirLine Reservation(Yes/No): ");
		String choice=sc4.nextLine();
		
		if(choice.equalsIgnoreCase("Yes"))
		{
			air.reservation();
		}else
		{
			System.out.println("THANK YOU!");
		}
		
		
		
	}

}
