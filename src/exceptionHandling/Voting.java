package exceptionHandling;

import java.util.*;


class InvalidAgeException extends RuntimeException{
	
	public InvalidAgeException(String msg) {
		super(msg);
	}
}

public class Voting extends RuntimeException{

	public static void main(String[] args) throws Throwable {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter voter age:");
		int age =s.nextInt();
		checkAgeForVoting(age);
		s.close();
 
	}
 
	public static void checkAgeForVoting(int age) throws Throwable {
		if(age >=18) {
			System.out.println("Hey! you are eligible for voting");
		}else {
			throw new InvalidAgeException("Hey! you are not eligible for voting");
		}
		
		
	}

}
