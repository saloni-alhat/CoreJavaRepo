package day3.polymorphisms;
import java.util.*;
public class TestShapes {
public static void main(String[] args) {
	
	Shapes shape=new Shapes();
	shape.calculateArea();
	Square square =new Square();
	Rectangle rectangle=new Rectangle();
	
	Scanner sc=new Scanner(System.in);
	int choice=sc.nextInt();
	if(choice==1)
	{
		square.calculateArea();
		
	}else if(choice==2)
	{
		rectangle.calculateArea();
	}else
		System.out.println("Invallid Choice ");
}

}
