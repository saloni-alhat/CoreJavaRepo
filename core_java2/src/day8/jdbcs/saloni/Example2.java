package day8.jdbcs.saloni;
import utility.DBUtil;
import java.sql.*;

public class Example2 {

	public static void main(String[] args) {
		try {
			Connection con=DBUtil.getMySqlDbConnection();
			String sql="insert into student values(102,'Amruta','Java',4,1200)";
			try {
				Statement st=con.createStatement();
				int result=st.executeUpdate(sql);
				if(result==0) {
					System.out.println("Insertion Failed");	
				}else {
					System.out.println("Data inserted successfully");
				}
				
				
			    } catch (Exception e) 
			    {
				System.out.println("Exception Occured: "+e);
		     	}
		
		
	}catch(Exception e) {
		System.out.println("Exception Occured: "+e);
	}
}
}
