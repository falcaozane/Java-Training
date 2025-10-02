package test;

public class Car {
	
	String model;
	double price;
	int wheels;
	
	Car(String model, double price, int wheels){
		this.model = model;
		this.price = price;
		this.wheels = wheels;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car("Porshe",2400,4);
//		c.model = "Porshe";
//		c.price = 2400.00;
//		c.wheels = 4;
		System.out.println(c.model);
		System.out.println(c.price);
		System.out.println(c.wheels);

	}

}
