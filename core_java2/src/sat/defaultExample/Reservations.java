package sat.defaultExample;


/*import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;*/
import java.util.Scanner;

public class Reservations implements AirLines{

	@Override
	public void reservation() {
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		Scanner sc3=new Scanner(System.in);
		
		System.out.println("Enter Full Name");
		String name=sc1.nextLine();
		
		System.out.println("Enter phone number: ");
		long ph_no=sc1.nextLong();
		
		System.out.println("Enter E-mail:  ");
		String email=sc2.nextLine();
		
		System.out.println("Enter Address: ");
		String address=sc2.nextLine();
		
		System.out.println("Enter Destination and Date: ");
		String destination=sc2.nextLine();
		String date=sc3.nextLine();
		
		/*SimpleDateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");
		Date date2=null;
		try {
		    date2 = dateFormat.parse(date);
		} catch (ParseException e) {
		  
		    e.printStackTrace();
		}
		System.out.println(date2);
		*/
		
		System.out.println("************************");
		System.out.println("Welcome "+name);
		System.out.println("Phone no: "+ph_no+"\nEmail-ID: "+email+"\nAddress: "+address);
		System.out.println("Destination: "+destination+"\nDate: "+date);
		}
	}
