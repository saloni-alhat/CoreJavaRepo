package day4.Interfaces.combine;

public class Architect extends Human implements MathGenius,Artist {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Architech can draw very well");
		
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("Architect is good in Maths..");
		
	}

}
