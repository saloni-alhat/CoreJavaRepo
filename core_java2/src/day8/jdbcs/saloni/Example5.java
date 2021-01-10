package day8.jdbcs.saloni;
import beans.Student;
import utility.DBUtil;
import java.sql.*;

public class Example5 {
	public static void main(String[] args) {
		Student product1 = new Student(105, "Sneha","Python",4,20000);
		Example5 example5 = new Example5();
		example5.addStudent(product1);

		}
		public void addStudent(Student student) {
		System.out.println("Now going to insert the product into db:"+student);
		
		Connection con= DBUtil.getMySqlDbConnection();
		String sql="insert into student values(?,?,?,?,?)";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1,student.getRoll_no());
			pst.setString(2, student.getStudent_name());
			pst.setString(3,student.getCourse());
			pst.setInt(4,student.getDuration());
			pst.setInt(5, student.getAge());
			int result = pst.executeUpdate();
			if(result==0) {
			System.out.println("Query Failed");
			}else {
			System.out.println("Success");
			}
		}catch(Exception e)
		{
			System.out.println("Exception occured: "+e);
		}
		}
}
