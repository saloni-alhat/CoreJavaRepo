package sat.arrayListExample;
import sat.classes.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAirport {
	
	//From Ankur
	public static void main(String[] args) {
		
		Airport airport1=new Airport(1001,"Indigo" ,"11:00am");
		Airport airport2=new Airport(2001,"GoAir" ,"12:30pm");
		Airport airport3=new Airport(3001,"Alliance" ,"01:00pm");
		Airport airport4=new Airport(4001,"SpiceJet" ,"03:45pm");
		
		ArrayList<Airport> airportList=new ArrayList<Airport>();
		airportList.add(airport1);
		airportList.add(airport2);
		airportList.add(airport3);
		airportList.add(airport4);
		
		Iterator<Airport> iter=airportList.iterator();
		while(iter.hasNext())
		{
			Airport x=iter.next();
			System.out.println(x);
		}
	}

}
