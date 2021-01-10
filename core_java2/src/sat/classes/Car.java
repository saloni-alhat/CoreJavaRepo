package sat.classes;

public class Car 
{
	private int carNo;
	private String carName;
	private int carPrice;
	
	public Car()
	{
		
	}

	public Car(int carNo, String carName, int carPrice) {
		super();
		this.carNo = carNo;
		this.carName = carName;
		this.carPrice = carPrice;
	}

	public int getCarNo() {
		return carNo;
	}

	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}

	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", carName=" + carName + ", carPrice=" + carPrice + "]";
	}
	
	

}
