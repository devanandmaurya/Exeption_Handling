package throw_keyword.com;

import java.util.Scanner;

public class Voting1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your age");
         
         int age=sc.nextInt();
         
         if(age<18)
         {
        	 throw new yougerageExc("u r  not elagible votr");
         }
         else
         {
        	 System.out.println("please vote you");
         }
	}
}