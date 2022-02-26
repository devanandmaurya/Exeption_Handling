package com.finaly.block;

//finally block ke under try cach block use kar sakte hai
public class FinallyBlock {

	// finally block always execute it is execute always and use for connection
	// close
	// agar try { } finnaly {} is case me exception handle nhi hoga aur finally
	// chalega hee

	//
	/*
	 * try { if ex occur agar //AGAR TRY KE ANDER EXCE AATI HAI TO CATCH BLOCK
	 * CHALEGA AUR FINALLY BHE CHALEGA //AGER TRY ME EXEPTION NHI AAYA TB CATCH NHI
	 * CHALEGA DIRECT FINNALLY BLOCK KE ANDER JAYEGA //
	 * 
	 * }
	 */
	// catch{
	// execute
	// }
	// finnaly
	// }

	
	

	static int a = 12, b = 0, c;

	public static void main(String[] args) {

		try {
			c = a / b;
			System.out.println(c);
			System.out.println("hello");
		} catch (Exception e) {

			System.out.println(e.toString()); // agar exeption occur nhi hota nhi to catch nhi chalega
			System.out.println("exception handling code write here ");

		} finally {
			System.out.println("hi all");
			System.out.println("finally block always run");
			System.out.println("db connection close code that is cleanup code  write in fillnly block");
			System.out.println("memory release code ,file close code reourcce close code");
		}
	}
}
