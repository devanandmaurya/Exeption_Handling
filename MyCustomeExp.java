package com.dk.customExeption;

public class MyCustomeExp extends Exception{
	public static void vailidateExpe(int age) {
		if (age < 18)
	//	{
			throw new ArithmeticException("Not valid user for vote");
		//}
			else //{
			System.out.println("welcome to vote..");

	}
	//}
	public static void main(String[] args) {
		vailidateExpe(40);
		System.out.println("Rest of code..");
	}

}
