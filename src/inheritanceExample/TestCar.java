package inheritanceExample;
 
public class TestCar {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		new Car(); // only car constructor is called
		BMW b=new BMW(); //both parent (car) and child (BMW) constructors are called
		b.start();
		b.stop();
		b.theftsafety();
		
		b.model="BMW";
		
		System.out.println(b.model);
		
	}
 
}