package day3.beans;

public class Student {
private int roll_no;
private String name, course;
public Student()
{
	
}
public Student(int roll_no, String name, String course) {
	super();
	this.roll_no = roll_no;
	this.name = name;
	this.course = course;
}

public int getRoll_no() {
	return roll_no;
}


public void setRoll_no(int roll_no) {
	this.roll_no = roll_no;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getCourse() {
	return course;
}


public void setCourse(String course) {
	this.course = course;
}



@Override
public String toString() {
	return "Student [roll_no=" + roll_no + ", name=" + name + ", course=" + course + "]";
}

}
