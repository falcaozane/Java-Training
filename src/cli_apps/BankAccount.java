package cli_apps;

public class BankAccount {
	
	private String name;
	private double balance;
	private int pin;
	
	public BankAccount(String name, int pin, double balance) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.balance = balance;
		this.pin = pin;
		System.out.println("Account Created for "+this.name);
	}
	
	public String getName() {
		return name;
	}
	
	public boolean verifyPin(int inputPin) {
		return this.pin == inputPin;
	}
	
	
	public void checkBalance() {
		System.out.println("Current Balance is : ₹ "+balance);
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
	}
	
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid or insufficient funds.");
        }

	}

}
