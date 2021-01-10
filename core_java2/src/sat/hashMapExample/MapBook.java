package sat.hashMapExample;
import sat.classes.*;
import java.util.*;
public class MapBook {
	public static void main(String[] args) {
		//From Devyani
		Book book1=new Book(101,"HarryPotter","J.K.Rowling",800);
		Book book2=new Book(101,"Baaz","Anuja Chauhan",500);
		Book book3=new Book(101,"Sita: Warrior of Mithila","Amish Tripathi",450);
		Book book4=new Book(101,"The Twentieth Wife","Indu Sundaresan.",700);
		
	HashMap<Integer, Book> hashBook=new HashMap<Integer, Book>();
	
	hashBook.put(1, book1);
	hashBook.put(2, book2);
	hashBook.put(3, book3);
	hashBook.put(4, book4);
	
	Set<Integer> keys=hashBook.keySet();
	Iterator<Integer> iter= keys.iterator();
	while(iter.hasNext())
	{
		Integer key=iter.next();
		Book book=hashBook.get(key);
		System.out.println(key+": "+book);
	}
	
	}
	


}
