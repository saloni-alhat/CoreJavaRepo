package day8.jdbcs.saloni;
import utility.DBUtil;
import java.sql.*;

public class Example1 {

	public static void main(String[] args) {
		try {
			Connection con=DBUtil.getMySqlDbConnection();
			String sql="select * from student";
			//Statement or PreparedStatement
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql); //for select queries, we use executeQuery
			
			while(rs.next())
			{
				int rollNo=rs.getInt("roll_no");
				String studentName=rs.getString("student_name");
				String courseDB=rs.getString("course");
				int durationDB=rs.getInt("duration");
				int ageDB=rs.getInt("age");
				
				System.out.println("Roll number: "+rollNo);
				System.out.println("Name: "+studentName);
				System.out.println("Course: "+courseDB);
				System.out.println("Duration: "+durationDB);
				System.out.println("Age: "+ageDB);
				
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println("Exception Occured: "+e);
		}
		
	}
}
