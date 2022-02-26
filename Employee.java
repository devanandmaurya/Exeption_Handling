package com.whenusethrows.whentrycatchblock;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Employee {
	public static void main(String[] args) {

		Runnable runnable = () -> System.out.println("hello run method");
		new Thread(runnable).start();

		List l = new ArrayList();
	}
}
