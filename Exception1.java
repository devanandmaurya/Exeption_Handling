package Exeption_Handling_Basics;
//an exp is an unwanted or unexeptated event .which occurs due to the execution of a program ig at  run time. 
//and disturbed the flow of program.
//number devide by zero 12/0;

//alternate way provide to solve program is called  exp handling


public class Exception1 {
	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3"); //it print top to bottom
		System.out.println("4");//expetion occurs (Exception in thread "main" java.lang.ArithmeticException: / by zero)
		System.out.println(5/0);
		System.out.println("6"); 
		
	}

}
