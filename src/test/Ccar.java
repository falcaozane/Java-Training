package test;

public class Ccar {
	
	String model;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initial object creation and model assignment
        Ccar a = new Ccar();
        Ccar b = new Ccar();
        Ccar c = new Ccar();

        a.model = "BMW";
        b.model = "Skoda";
        c.model = "Maruti";

        // First set of print statements
        System.out.println(a.model);
        System.out.println(b.model);
        System.out.println(c.model);

        // Object reference reassignments
        a = b;
        b = c;
        c = a; // 'a' currently points to the object originally held by 'b' (Skoda object)

        System.out.println("\nAfter referencing\n");
        
        // Second set of print statements
        System.out.println(a.model);
        System.out.println(b.model);
        System.out.println(c.model);
	}

}
