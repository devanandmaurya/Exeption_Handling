package com.checked.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckException {
	// The exception that compiler able to checked at compile time called checked or
	// compile time exp..
	// java.io.FileNotFoundException it occurs in this case
	// it just warn at compile time
	public CheckException() {

		System.out.println(" default constr hello");
	}

	public static void main(String[] args) {

		// System.out.println("cons call");
		try {
			System.out.println("go went");
			@SuppressWarnings("unused")
			FileInputStream fil = new FileInputStream("C:\\Users\\DEV\\Desktop\\a.txt");
		} catch (FileNotFoundException e) {
			System.out.println("bye bye ");
			e.printStackTrace();
			System.out.println("done");
		}

		System.out.println("run here ");
		// output is cons call no out put of done and no out put of hello no bye bye
		// out put comes
		// go went run
		// it means that if if try block execute then catch block never execute thats
		// why risky code write there
		// after catch block code will execute
	}
}
