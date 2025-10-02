package userDefinedFunctions;


public class Car {
	
	String model;
	double price;
	static int wheels = 4;
	
	Car(){
		System.out.println("Building Car.....");
	}
	
	Car(String model, double price, int wheels){
		this.model = model;
		this.price = price;
		Car.wheels = wheels;
	}
	
	public void modelDescription() {
		System.out.println("The model is "+this.model+" it is worth "+this.price+" it has "+wheels+" wheels.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car("Porshe",2400,4);
//		c.model = "Porshe";
//		c.price = 2400.00;
//		c.wheels = 4;
		new Car();
		System.out.println(c.model);
		System.out.println(c.price);
		System.out.println(Car.wheels);
		
		c.modelDescription();

	}

}

