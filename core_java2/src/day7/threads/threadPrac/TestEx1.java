package day7.threads.threadPrac;

public class TestEx1 {
	public static void main(String[] args) {
		Example example=new Example();
		Thread thread1=new Thread(example);
		thread1.start();
	}
		
}
