package com.app.logical.programs;

import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		
		//long fact= getFactorialIterative(number);
		long fact=getFactorialRecursive(number);
		System.out.println("factorial of :"+number+" is:"+fact);
	}//main()
	
	private static long getFactorialIterative(int number){
		
		System.out.println("FactorialTest.getFactorial()");
	    int fact=1;
		while(number>0) {
			fact *=number--;
			//number--;
			
		}//while
		
		return fact;
	}//getFactorial()

	private static long getFactorialRecursive(int number){
	
		//System.out.println("FactorialTest.getFactorialRecursive()");
		if(number ==0 || number ==1) {
			System.out.println("FactorialTest.getFactorialRecursive()");
			return 1;
		}
		
		
		return(number * getFactorialRecursive(--number) );
	}		
}//class
