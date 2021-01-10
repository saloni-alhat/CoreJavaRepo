package sat.arrayListExample;
import java.util.*;
import sat.classes.*;
public class ArrayListInfo{
	public static void main(String[] args) {
		//from Amruta
		
		PersonalInfo personalInfo1=new PersonalInfo("John","Unmarried");
		PersonalInfo personalInfo2=new PersonalInfo("David","Married");
		PersonalInfo personalInfo3=new PersonalInfo("Alex","Unmarried");
		
		ArrayList<PersonalInfo> infoList=new ArrayList<PersonalInfo>();
		infoList.add(personalInfo1);
		infoList.add(personalInfo2);
		infoList.add(personalInfo3);
		
		for(PersonalInfo info:infoList)
		{
			System.out.println(info);
		}
	}
	
}
