package Exeption_Handling_Basics;
/*
//exception heraerchy 
// object class is the parent class of all the java class 
public class Exception2 {

}
  

EXECPTION AND ERROR KI PARRENT CLASS IS THROWOABLRE HAI


                               OBJECT
                               
                               !
                               !
                        THROWABLE
                        !
                        !
                        !
                        !
   _______________________________!---------------------------------!
   !
(   EXCEPTION )                                                ( ERROR)
   1 IT OCCURS BECUSE OF OUR PROGRAM 
   2 EXCEPTION IS RECOVERABLR
   3 EXPTION IS TWO TYPE  COMPILE TIME (CHECKED EXC) AND RUNTIME EXP (UNCHECKED EXP)
   
   
   
   
   ERRORS->
   
   
   ERROR ARE OCCURES LACK OF  SYSTEM RESOURCE
   IT IS ONE TYPE ONLY RUNTIME EXCEPTION OR UNCHECKED EXCEPTION
   ERROR ARE NOT RECOVERABLE 
                                
   
 !ERROR>>> VIRTUAL MEMORY ERROR
           */

public class Exception2 {

	public static void main(String[] args) {

		try {
			int a = 109, b = 0, c;
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {

		//	e.printStackTrace();//it pint exception name and description and stack trace
		//	System.out.println(e);
		//	System.out.println(e.toString()); //exception name and trace 
			//System.out.println(e.getMessage());// print it only description that is msge 
			System.out.println(e.getLocalizedMessage());// only error by which print like /by zero
			//System.out.println(e.getStackTrace()); //only package  name and strackeTraceElement 
		}
	}
}
