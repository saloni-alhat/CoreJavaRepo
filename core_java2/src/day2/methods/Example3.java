package day2.methods;

public class Example3 {
	
	public static int add(int x, int y) {
		 int z=x+y;
		return z;
	}
	
   public static int sub(int x, int y) {
	
		 int z=x-y;
		return z;
   }

public static void main(String[] args) {
	int result1=add(4,5);
	int result2=sub(27,9);
	
	System.out.println("Add: "+result1);
	System.out.println("Sub: "+result2);
}
}