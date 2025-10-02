package cli_apps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean running = true;
		double balance = 0;
		
		Scanner sc = new Scanner(System.in);
		List<BankAccount> accounts = new ArrayList<>();
		
		
		
		while(running) {

			System.out.println("\n--- Welcome to Simple Bank ---");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            
            switch (option) {

            		case 1:
                       System.out.print("Enter your name: ");
                       String name = sc.nextLine();
                       System.out.print("Set a 4-digit PIN: ");
                       int pin = sc.nextInt();
                       sc.nextLine();
                       accounts.add(new BankAccount(name, pin, balance));
                       System.out.println("Account created successfully!");
                       break;

				case 2:
					System.out.println("Enter your name: ");
					String loginName = sc.nextLine();
					System.out.println("Enter your pin: ");
					int loginPin = sc.nextInt();
					sc.nextLine();
					
					BankAccount user = null;
					
					for(BankAccount acc: accounts) {
						if(acc.getName().equalsIgnoreCase(loginName) && acc.verifyPin(loginPin)) {
							user = acc;
							break;
						}
					}
					
					if(user!=null) {
						System.out.println("------Successfully Loggend In----");
						System.out.println("Welcome, "+user.getName()+" !");
						boolean loggedIn = true;
						
						while(loggedIn) {
							System.out.println("\n--- Account Menu ---");
                            System.out.println("1. Check Balance");
                            System.out.println("2. Deposit");
                            System.out.println("3. Withdraw");
                            System.out.println("4. Logout");
                            System.out.print("Choose an option: ");
                            int choice = sc.nextInt();
                            
                            switch(choice) {

                            		case 1: 
                            			user.checkBalance(); 
                            			break;
                                case 2:
                                    System.out.print("Enter amount to deposit: ₹");
                                    user.deposit(sc.nextDouble());
                                    break;
                                case 3:
                                    System.out.print("Enter amount to withdraw: ₹");
                                    user.withdraw(sc.nextDouble());
                                    break;
                                case 4:
                                    System.out.println("Logged out.");
                                    loggedIn = false;
                                    break;

                                default:
                                        System.out.println("Invalid option.");


                            }
                            
                            

						}
					}
					
                    break;
				
				case 3:
					System.out.println("Thank you for banking with us !");
					running = false;
                    	break;
				default:
				    System.out.println("Invalid option. Please choose between 1 and 4.");
			}

		}
		
		sc.close();
	}

}
