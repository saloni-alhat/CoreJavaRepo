package day7.exceptions.exceptionPrac;

public class DivException {
public static void main(String[] args) {

	try {
		int a[]=new int[5];
		a[5]=30/0;
	}
	catch(ArithmeticException e) {
		System.out.println("Arithmetic Exception is occured");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("ArayIndexOutOfBound Exception is occured");
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
