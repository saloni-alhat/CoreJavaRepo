package sat.arrayListExample;
import java.util.*;
import sat.classes.*;
public class ArrayListCar {
	public static void main(String[] args) {
		//From Aarohi
	
		Car car1=new Car(101,"Volvo",2500000);
		Car car2=new Car(201,"Audi",5000000);
		Car car3=new Car(301,"Honda",3500000);
		Car car4=new Car(401,"Hundai",2000000);
		
		ArrayList<Car> carList=new ArrayList<Car>();
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		carList.add(car4);
		
		for(int i=0;i<carList.size();i++)
		{
			Car detail=carList.get(i);
			System.out.println(detail);
		}
		
	}

}
