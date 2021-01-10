package day9.jdbc;
import beans.Product;
import utility.DBUtil;
import java.sql.*;

public class Example1 {
	public static void main(String[] args) {
		Product product1 = new Product(3, "TAB", 50000);
		Example1 example7 = new Example1();
		//example7.addProduct(product1);
		//example7.getAllProducts();
		example7.getProduct(5);
		
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

public void getAllProducts()
{
	Connection con = DBUtil.getMySqlDbConnection();
	String sql = "select * from product";
	try {
	PreparedStatement pst = con.prepareStatement(sql);
	ResultSet rs = pst.executeQuery();
	while(rs.next()) {
	int productId = rs.getInt("product_id");
	String productName = rs.getString("product_name");
	int price = rs.getInt("price");
	System.out.println("productId:"+productId);
	System.out.println("productName:"+productName);
	System.out.println("price:"+price);
	System.out.println("***************************");
	}
	}catch(Exception e) {
	System.out.println("Exception Occured:"+e);
	}
}
public void getProduct(int productId)
{
	Connection con = DBUtil.getMySqlDbConnection();
	String sql = "select * from product where product_id=?";
	try {
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, productId);
		ResultSet rs = pst.executeQuery();
		if(rs.next()) {
			String productName=rs.getString("product_name");
			int price = rs.getInt("price");
		
		System.out.println("productId:"+productId);
		System.out.println("productName:"+productName);
		System.out.println("Price:"+price);
		System.out.println("***************************");
		}else {
			System.out.println("Product Id does not exist");
		}
		}catch(Exception e) {
		System.out.println("Exception Occured:"+e);
		}
}
}