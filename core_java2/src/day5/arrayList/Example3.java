package day5.arrayList;
import java.util.*;
import day3.beans.Student;


public class Example3 {

	public static void main(String[] args) {
		Student stud1=new Student(01,"Derek","BE");
		Student stud2=new Student(02,"John","ME");
	
		Student stud4=new Student(04,"Lisa","BE");
		
		ArrayList<Student> studentList=new ArrayList<Student>();
		studentList.add(stud1);
		studentList.add(stud2);
		
		studentList.add(stud4);
		
		Iterator<Student> iter=studentList.iterator();
		while(iter.hasNext())
		{
			Student x=iter.next();
			System.out.println(x);
		}
		}
		
	}

