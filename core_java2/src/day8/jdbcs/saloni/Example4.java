package day8.jdbcs.saloni;
import utility.DBUtil;
import java.sql.*;

public class Example4 {

	public static void main(String[] args) {
		int rollNo=101;
			Connection con=DBUtil.getMySqlDbConnection();
			String sql="select *from student where roll_no=?";
			try {
				PreparedStatement pst=con.prepareStatement(sql);
				pst.setInt(1, rollNo);
				ResultSet rs=pst.executeQuery();
				
				if(rs.next())
				{
					int roll=rs.getInt("roll_no");
					if(rollNo==roll)
						System.out.println("Student found");	
				}else 
					System.out.println("Student not found");
			}catch (Exception e) 
			{
				System.out.println("Exception Occured: "+e);
			}
	}
}