package day9.jdbc;
import beans.Product;
import utility.DBUtil;
import java.sql.*;

public class ProductDao {
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
		
		public void deleteProduct(int productId) {
			Connection con = DBUtil.getMySqlDbConnection();
			String sql = "delete from product where product_id=?";
			try {
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setInt(1, productId);
			int rs = psmt.executeUpdate();
			if(rs== 0) {
			System.out.println("Product with id:"+productId+" does not exist");
			}else {
			System.out.println("Deletion successfull");
			}
			}catch(Exception e) {
			System.out.println("Exception occured: "+e);
			}
			}
		
		public void updateProduct(Product product) {
			Connection con = DBUtil.getMySqlDbConnection();
			String sql = "update product set product_name =?,product_price=? where product_id=?";
			try {
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setInt(1, product.getProductId());;
			psmt.setDouble(2, product.getPrice());
			psmt.setInt(3,product.getProductId());

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