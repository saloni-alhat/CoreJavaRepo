package day4.innerClasses;

import day4.innerClasses.OuterClass.InnerClass;

public class Test {
	public static void main(String[] args) {
		OuterClass outerClass=new OuterClass();
		System.out.println("Value of Outer class: "+outerClass.x);
	
		InnerClass innerClass=outerClass.new InnerClass();
		System.out.println("Value of Inner class: "+innerClass.y);
	}

}
