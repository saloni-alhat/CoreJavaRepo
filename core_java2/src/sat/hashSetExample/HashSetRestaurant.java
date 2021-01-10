package sat.hashSetExample;
import java.util.*;
import sat.classes.*;
public class HashSetRestaurant {
public static void main(String[] args) {
	//from Shruthi
	
	Restaurant restaurant1=new Restaurant(1001,"Saloni",2500);
	Restaurant restaurant2=new Restaurant(2001,"Amruta",2000);
	Restaurant restaurant3=new Restaurant(3001,"Deeksha",2500);
	
	HashSet<Restaurant> setRestaurant=new HashSet<Restaurant>();
	
	setRestaurant.add(restaurant1);
	setRestaurant.add(restaurant2);
	setRestaurant.add(restaurant3);
	
	Iterator<Restaurant> iter=setRestaurant.iterator();
	while(iter.hasNext())
	{
		Restaurant res=iter.next();
		System.out.println(res);
	}
}
}
