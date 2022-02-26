package com.dk.UserDefindException;

public class MainBankDemo {

	public static void main(String[] args) {
		CheckingAccount c = new CheckingAccount(101);
		System.out.println("Depositing Rs.500...");
		c.deposit(500.00);
		try {
			System.out.println("\nWithdrawing Rs.100...");
			c.withdraw(100.00);
			System.out.println("\nWithdrawing Rs.600...");
			c.withdraw(600.00);
		} catch (InsufficientFundsException e) {
			System.out.println("Sorry, but you are short Rs." + e.getAmount());
			e.printStackTrace();
		}
	}
}
