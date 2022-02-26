package com.checked.exception;

public class checkedexp {

	public checkedexp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)// throws ClassNotFoundException, FileNotFoundException {
	{
		// FileInputStream fil = new FileInputStream("C:\\Users\\DEV\\Desktop\\a.txt");
		// Class.forName("com.mysql.jdbc.DriverManager");
		System.out.println("hi all"); // it give out put hi all
		String st = null;
		int a = 100, b = 00, c; // RUN TIME EXCEPTION HAI THAT IS UNCHECKED EXC will b compiled but abnormal termination of program
		try {
			// c = a / b;
			c = a / b;
			
			System.out.println(st.length()); // java.lang.NullPointerException unckehed or  runtime exception hai

			System.out.println(c);

		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("asd");
		}
		System.out.println(" hi");
		// class ClassNotFoundException exception and FileNotFoundException exteion both
		// are checked exception or compile time exception
	}
}