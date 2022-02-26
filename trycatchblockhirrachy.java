package com.checked.exception;

public class trycatchblockhirrachy {

	// THERE ARE FIVE WAY TO HANDLE EXPTION TRY CATCH THROW THROWS FINLLY.

	public trycatchblockhirrachy() {
		System.out.println("hello cost");
	}

	public static void main(String[] args) {
		int a = 12, b =00, c;
		System.out.println("hello");
		String sss= null;
		// try catchblockhirrachy t = new trycatchblockhirrachy(); // when we create
		// object then out put comes of construe {hello cost}.
		try {
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			c=a/b; // ab 1 2 3 tak chalega aur 
			System.out.println(4);
			System.out.println(5);
			try {
				
			} finally {
				// TODO: handle finally clause
				System.out.println("Finaly block always execute....");
			
			c = a / b; 
			System.out.println(11);
			System.out.println(sss); // yah nhi chalega
			// 11 nhi chalega
			//5 k bad direct catch block me jata hai aur ager try block me error aata hai to he 
			//catch block chalta hai hai other wise nhi chalta h catch block
			// jab ham b=1234567 likh denge to catch block nhi chalega
			System.out.println(6);
			System.out.println(7);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(8);
			System.out.println(9);
			System.out.println(10);
			System.out.println("you can't devide by zero");
		}
		System.out.println("hi all");
	}
}
