package userDefinedFunctions;

public class LearningStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("Srinivas");
		
		s.concat("Narayan");
		System.out.println(s);
		
		StringBuffer sb=new StringBuffer("Srinivas");
        sb.append("Narayan");
        System.out.println(sb);
        
        System.out.println("===========================================");
        
        String s1 = new String("Srinivas");
        String s2 = new String("Srinivas");
        
        System.out.println(s1==s2); // Comparison of addresses
        System.out.println(s1.equals(s2)); // Comparison of values
        
        System.out.println("===========================================");
        
        StringBuffer sb1 = new StringBuffer("Srinivas");
        StringBuffer sb2 = new StringBuffer("Srinivas"); 
        
        System.out.println(sb1==sb2); // Comparison of addresses
        System.out.println(sb1.equals(sb2)); // Comparison of references
        
        System.out.println("===========================================");
        
        String zane = new String("Zane");
        zane.concat(" Falcao");
        zane = zane.concat(" is a Tester");
        
        System.out.println(zane); // Zane is a Tester
        
        
	}

} 
