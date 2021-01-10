package day7.exceptions.exceptionPrac;

public class Example2 {
	static void checkEven(int num)throws Exception {
	    if (num%2!=0) {
	      throw new Exception("Access denied - Number is not an Even number.");
	    }
	    else {
	      System.out.println("Access granted - Number is Even number!");
	    }
	  }

	  public static void main(String[] args) {
		  try
		  {
			  checkEven(15); 
		  }catch(Exception e)
		  {
			  System.out.println("Something went wrong: "+e.getMessage());
		  }
	   
	  }
	
}
