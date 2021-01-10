package day8.jdbcs;

import java.sql.*;

import utility.DBUtil;

public class Example5 {

	public static void main(String[] args) {
		String userName="john";
		String pass="123";
		
		Connection con=DBUtil.getMySqlDbConnection();
		String sql="select * from login where user_id=?";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, userName);
			ResultSet rs=pst.executeQuery();
			
			while(rs.next())
			{
				String user=rs.getString("user_id");
				String pass1=rs.getString("password");
				
				if(user.equals(userName)&&pass1.equals(pass))
				{
					System.out.println("Login successfull");
				}else {
					System.out.println("Login Failed ");
				}
			}
			
		    } catch (Exception e) 
		    {
			System.out.println("Exception Occured: "+e);
	     	}
		
	}
	
	}
