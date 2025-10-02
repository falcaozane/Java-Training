package inheritanceSamaj;

public class Vehicle {
	
	protected String brand;
	protected int year;
	
	public Vehicle(String brand, int year) {
		// TODO Auto-generated constructor stub
		this.brand = brand;
		this.year = year;
	}
	
	public void displayBasicInfo() {
		System.out.println("Brand of the vehicle is :"+brand);
		System.out.println("This model was manufactured in : "+year);
	}

}
