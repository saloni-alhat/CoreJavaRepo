package sat.hashSetExample;

import java.util.*;

import sat.classes.SmartPhone;

public class HashSetPhone {
public static void main(String[] args) {
	//from Noorul
	SmartPhone phone1=new SmartPhone("Samsung", 38000);
	SmartPhone phone2=new SmartPhone("Oppo", 26000);
	SmartPhone phone3=new SmartPhone("Vivo", 30000);
	SmartPhone phone4=new SmartPhone("MI", 20000);
	
	Set<SmartPhone> setphone=new HashSet<SmartPhone>();
	setphone.add(phone1);
	setphone.add(phone2);
	setphone.add(phone3);
	setphone.add(phone4);
	
	for(SmartPhone x: setphone)
	{
		System.out.println(x);
	}
}
}
