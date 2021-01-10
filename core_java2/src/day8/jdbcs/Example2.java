package day8.jdbcs;

import java.sql.*;

//Demo of JDBC connection
public class Example2 {
public static void main(String[] args) {
	String driverClassName="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/java_training";
	String dbUserName="root";
	String dbPassword="samysql";
	try {
		Class.forName(driverClassName);
		Connection con=DriverManager.getConnection(url,dbUserName,dbPassword);
		System.out.println("Connection: "+con);
		
		String sql="select * from login";
		//Statement or PreparedStatement
		PreparedStatement st=con.prepareStatement(sql);
		ResultSet rs=st.executeQuery(); //for select queries, we use executeQuery
		
		while(rs.next())
		{
			String userName=rs.getString("user_id");
			String pass=rs.getString("password");
			System.out.println("Username: "+userName+"\tPassword: "+pass);
			System.out.println("***************************************");
			//System.out.println(rs.getString(1)+rs.getString(2));
		}
		con.close();
	}
	catch(Exception e) {
		System.out.println("Exception Occured: "+e);
	}
	
}
}
