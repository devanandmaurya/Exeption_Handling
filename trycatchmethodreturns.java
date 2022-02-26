package com.checked.exception;

public class trycatchmethodreturns {

	public trycatchmethodreturns() {
		System.out.println("hi all");
	}

	public  static  final String ishow() {
		System.out.println("hi  how r u");

		return "ASD";
		//return "";
		//return "hi ";

	}

	public static void main(String[] args) {
		trycatchmethodreturns aa = new trycatchmethodreturns();
		aa.ishow();
	}
}
