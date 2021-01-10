package day3.classes;

public class TestEmployee {

 public static void main(String[] args) {
        Employee employee=new Employee();
        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getEmployeeId());
        
        employee.setEmployeeId(12320);
        employee.setEmployeeName("Saloni");
        
        System.out.println(employee.getEmployeeName());
        System.out.println(employee.getEmployeeId());
        
        System.out.println("Creating parametrise one: ");
        Employee employee1 = new Employee(2320,"David");
        
        System.out.println(employee1.getEmployeeName());
        System.out.println(employee1.getEmployeeId());
        
        // implement ToString method in Employee class
        
        System.out.println(employee1);
    }
    
}
 