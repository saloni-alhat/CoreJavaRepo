package day3.classes;

public class Employee {
 public int employeeId;
 public String employeeName;
 public Employee()
 {
	 
 }
 
  
public Employee(int employeeId, String employeeName) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
}


@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
}


public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int empId) {
	this.employeeId = empId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String empName) {
	this.employeeName = empName;
}
 
 
}
