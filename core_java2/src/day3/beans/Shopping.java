package day3.beans;

public class Shopping {
	private int customerId, no_of_Items, price;
	private String name;
	
	public Shopping()
	{
		
	}
	
	public Shopping(int customerId, int no_of_Items, int price, String name) {
		super();
		this.customerId = customerId;
		this.no_of_Items = no_of_Items;
		this.price = price;
		this.name = name;
	}

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getNo_of_Items() {
		return no_of_Items;
	}
	public void setNo_of_Items(int no_of_Items) {
		this.no_of_Items = no_of_Items;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Shopping [customerId=" + customerId + ", no_of_Items=" + no_of_Items + ", price=" + price + ", name="
				+ name + "]";
	}
	 
	
	
	

}
