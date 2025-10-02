package AnujKumarSharma;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog lab = new Dog();
		
		lab.bark();
		lab.walk();
		
		Cat pur = new Cat();
		pur.meow();
		pur.walk();

	}

}


class Dog{
	String name;
	int age;
	String color;
	
	void walk() {
		System.out.println("Dog is walking!");
	}
	
	void bark() {
		System.out.println("Dog is barking!");
	}
}

class Cat{
	String name;
	int age;
	String color;
	
	void walk() {
		System.out.println("Cat is walking!");
	}
	
	void meow() {
		System.out.println("Cat is meow!");
	}
}