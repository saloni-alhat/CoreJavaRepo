package day5.abstractions.example1;

public class A implements Calculator,Maths {

		public void sub() {
		// TODO Auto-generated method stub
		int x=20,y=10;
		int z=x-y;
		System.out.println(z);
	}

	public void add() {
		// TODO Auto-generated method stub
		int x=5,y=10;
		int z=x+y;
		System.out.println(z);
		
	}
public static void main(String[] args) {
	A a=new A();
	a.add();
	a.sub();
}
}
	
