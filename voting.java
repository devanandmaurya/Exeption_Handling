package throw_keyword.com;

import java.util.Scanner;

class vo extends RuntimeException {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public vo(String msg) {

	}
}

class voting {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");

		int age = sc.nextInt();
		try {

			if (age < 18) {
				throw new vo("u r  not elagible vote");
			} else {
				System.out.println("please vote you can");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getSuppressed());
		}
	}
}