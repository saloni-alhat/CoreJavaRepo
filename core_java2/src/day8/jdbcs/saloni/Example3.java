package day8.jdbcs.saloni;
import utility.DBUtil;
import java.sql.*;

public class Example3 {

	public static void main(String[] args) {
		
			Connection con=DBUtil.getMySqlDbConnection();
			String sql="insert into student values(?,?,?,?,?)";
			try {
				PreparedStatement pst=con.prepareStatement(sql);
				pst.setInt(1, 103);
				pst.setString(2,"Deeksha");
				pst.setString(3,"Advanced Java");
				pst.setInt(4, 4);
				pst.setInt(5, 15000);
				int result=pst.executeUpdate();
				if(result==0) {
					System.out.println("Insertion Failed");	
				}else {
					System.out.println("Data inserted successfully");
				}
				
				
			    } catch (Exception e) 
			    {
				System.out.println("Exception Occured: "+e);
		     	}
	
}
}
