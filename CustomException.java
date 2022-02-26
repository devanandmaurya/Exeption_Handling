package com.dk.customExeption;
//You can also create your own exception sub class simply by extending java Exception class.
//You can define a constructor for your Exception sub class (not compulsory) and you can
//override the toString() function to display your customized message on catch.
//Points to Remember
//1. Extend the Exception class to create your own ecxeption class.
//
//2. You don't have to implement anything inside it, no methods are required.
//3. You can have a Constructor if you want.
//4. You can override the toString() function, to display customized message.

////////////////
class MyException extends Exception {
	private int ex;

	MyException(int ex) {
		this.ex = ex;
	}

	public String toString() {
		return "MyException[" + ex + "] is less than zero .//";
	}
}

class CustomException {
public	static void sum(int a, int b) throws MyException {
		if (a < 0) {
			throw new MyException(a);
		} else {
			System.out.println(a + b);
		}
	}

	public static void main(String[] args) {
		try {
			sum(-10, 105);
		} catch (MyException me) {
			System.out.println(me);
		}
	}
}