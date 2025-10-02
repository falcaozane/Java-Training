package inheritanceExample;
 
public class BMW extends Car{
	public BMW() {
		System.out.println("BMW constructor");
	}
 
	public void start() {
		System.out.println("BMW has its own way of starting car");
	}
	
	public void theftsafety() {
		System.out.println("This is a spl feature in BMW");
	}
 
}