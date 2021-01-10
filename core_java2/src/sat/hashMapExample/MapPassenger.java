package sat.hashMapExample;
import java.util.*;
import sat.classes.*;
public class MapPassenger {
 public static void main(String[] args) {
	//From Deeksha
	 
	 Passenger passenger1=new Passenger("Saloni", 101);
	 Passenger passenger2=new Passenger("Amruta", 201);
	 Passenger passenger3=new Passenger("Deeksha",301);
	 Passenger passenger4=new Passenger("Sneha", 401);
	 
	 HashMap<Integer, Passenger> hashPass=new HashMap<Integer,Passenger>();
	 
	 hashPass.put(1,passenger1);
	 hashPass.put(2,passenger2);
	 hashPass.put(3,passenger3);
	 hashPass.put(4,passenger4);
	 
	 Set<Integer> key=hashPass.keySet();
	 for(int x:key)
	 {
		 Passenger pass=hashPass.get(x);
		 System.out.println(pass);
	 }
	 
}
}
