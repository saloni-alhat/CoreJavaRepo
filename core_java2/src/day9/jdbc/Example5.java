package day9.jdbc;
import beans.Student;
import utility.DBUtil;
import java.sql.*;

public class Example5 {
	public static void main(String[] args) {
		Student student = new Student(102, "Shrutee","java",4,24);
		Example5 example5 = new Example5();
		//example5.addStudent(product1);
		//example5.getAllStudents();
		//example5.getStudent(102);
		//example5.getStudent("Saloni");
		//example5.deleteStudent(101);
		example5.updateStudent(student);
		
		

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
		
		public void getAllStudents()
		{
			Connection con = DBUtil.getMySqlDbConnection();
			String sql = "select * from student";
			try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
			int rollNo = rs.getInt("roll_no");
			String studentName = rs.getString("student_name");
			String courseDB = rs.getString("course");
			int duration = rs.getInt("duration");
			int price=rs.getInt("price");
			
			System.out.println("RollNo:"+rollNo);
			System.out.println("Name:"+studentName);
			System.out.println("Course: "+courseDB);
			System.out.println("Duration"+duration);
			System.out.println("price:"+price);
			System.out.println("***************************");
			}
			}catch(Exception e) {
			System.out.println("Exception Occured:"+e);
			}
		}
		public void getStudent(int rollNo)
		{
			Connection con = DBUtil.getMySqlDbConnection();
			String sql = "select * from student where roll_no= ?";
			try {
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setInt(1, rollNo);
				ResultSet rs = pst.executeQuery();
				if(rs.next()) {
					String studentName=rs.getString("student_name");
					String course=rs.getString("course");
					int ageDB = rs.getInt("age");
					int duration = rs.getInt("duration");
				
				System.out.println("RollNo:"+rollNo);
				System.out.println("Name:"+studentName);
				System.out.println("Course: "+course);
				System.out.println("Duration"+duration);
				System.out.println("Age:"+ageDB);
				System.out.println("***************************");
				
				}else {
					System.out.println("Roll_no does not exist");
				}
				}catch(Exception e) {
				System.out.println("Exception Occured:"+e);
				}
		}
		public void getStudent(String studentName)
		{
			Connection con = DBUtil.getMySqlDbConnection();
			String sql = "select * from student where student_name=?";
			try {
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, studentName);
				ResultSet rs = pst.executeQuery();
				if(rs.next()) {
					int rollNo=rs.getInt("roll_no");
					String course=rs.getString("course");
					int ageDB = rs.getInt("age");
					int duration = rs.getInt("duration");
				
				System.out.println("RollNo:"+rollNo);
				System.out.println("Name:"+studentName);
				System.out.println("Course: "+course);
				System.out.println("Duration"+duration);
				System.out.println("Age:"+ageDB);
				System.out.println("***************************");
				
				}else {
					System.out.println("Name does not exist");
				}
				}catch(Exception e) {
				System.out.println("Exception Occured:"+e);
				}
		}
		
		public void deleteStudent(int rollNo) {
			Connection con = DBUtil.getMySqlDbConnection();
			String sql = "delete from student where roll_no=?";
			try {
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setInt(1, rollNo);
			int rs = psmt.executeUpdate();
			if(rs== 0) {
			System.out.println("Student with roll no:"+rollNo+" does not exist");
			}else {
			System.out.println("Deletion successfull");
			}
			}catch(Exception e) {
			System.out.println("Exception occured: "+e);
			}
			}
		
		public void updateStudent(Student student) {
			Connection con = DBUtil.getMySqlDbConnection();
			String sql = "update student set student_name =?,course=? where roll_no=?";
			try {
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1, student.getStudent_name());
			psmt.setString(2, student.getCourse());
			psmt.setInt(3,student.getRoll_no());

			int res = psmt.executeUpdate();
			if(res == 0) {
			System.out.println("Updation of records failed");
			}else {
			System.out.println("Records successfully updated");
			}
			con.close();
			}catch(Exception e) {
			System.out.println("Excpetion occured: "+e);
			}
			}
}
