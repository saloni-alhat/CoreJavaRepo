package day1.switches;

public class Example3 {
public static void main(String[] args) {
	 int age = 18;        
     switch (age)  
     {  
         case (12):            
             System.out.println("Under 18.");  
             break;  
         case (18):                
             System.out.println("Eligible for vote.");  
             break;  
         case (65):                
             System.out.println("Senior citizen.");  
             break;  
         default:  
             System.out.println("Invalid age.");  
             break;  
     }             
}
}
