package sat.classes;

public class Book {
	private int id;
    private String name;
    private String author;
    private int price;
    
    public Book() {
    	
    }
    public Book(int id, String name, String author, int price) {
		
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return author;
	}
	public void setDesignation(String designation) {
		this.author = designation;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", Author=" + author + ", Price=" + price + "]";
	}
	
}
