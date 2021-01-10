package day2.methods;

public class Example6 {
public void displayNamesArray(String[] names)
{
	for(String s:names)
		System.out.println(s);
}


public String[] getArrayOfNames() {
	String[] names= {"John","David","Patrick","Derek"};
	return names;
}
}