package day8.jdbcs;
import beans.Product;
import utility.DBUtil;
import java.sql.*;

public class Example7 {
	public static void main(String[] args) {
		Product product1 = new Product(1, "Laptop", 52000);
		Example7 example7 = new Example7();
		example7.addProduct(product1);

		}
		public void addProduct(Product product) {
		System.out.println("Now going to insert the product into db:"+product);
		
		Connection con= DBUtil.getMySqlDbConnection();
		String sql="insert into product values(?,?,?)";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, product.getProductId());
			pst.setString(2, product.getProductName());
			pst.setDouble(3, product.getPrice());
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
