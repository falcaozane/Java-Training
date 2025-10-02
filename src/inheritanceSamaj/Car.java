package inheritanceSamaj;

public class Car extends Vehicle implements VehicleActions {
	
	private String model;
	private double price;
	

	public Car(String brand, int year,String model) {
		// TODO Auto-generated constructor stub
		
		this(brand,year,model,0.0);
		
	}
	
	public Car(String brand, int year,String model, double price) {
		// TODO Auto-generated constructor stub
		super(brand,year);
		this.model= model;
		this.price = price;
		
	}
	

	public void displayCarInfo() {
        super.displayBasicInfo(); // Calls Vehicle's displayInfo()
        System.out.println("Model: " + this.model);
        System.out.println("Price: ₹" + this.price);
    }
	
	public void start() {
		System.out.println("Car started.");
	}
	
	public void stop() {
		System.out.println("Car stopped.");
	}
	
	
}
