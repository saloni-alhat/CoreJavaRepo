package day3.classes;

import day3.beans.*;

public class TestShopping {
	public static void main(String[] args) {
		Shopping shopping1 =new Shopping(1001,3,10000,"Lisa");
		Shopping shopping2=new Shopping(2001,4,20000,"John");
		Shopping shopping3=new Shopping(3001,2,8000,"David");
		
		Shopping[] arrayOfShopping= {shopping1, shopping2, shopping3};
		
		TestShopping testShopping=new TestShopping();
		
		testShopping.displayAllShopping(arrayOfShopping);
	}
	public void displayAllShopping(Shopping[] arrayOfShopping)
	
	{
		for(Shopping shopping:arrayOfShopping)
		{
		System.out.println(shopping);
		
	}
	}
}
