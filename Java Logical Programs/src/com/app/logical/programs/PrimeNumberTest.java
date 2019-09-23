
package com.app.logical.programs;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
		
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		
		//isPrime(input);
		
		//boolean result=isPrimeNumber1(input);
		//boolean result=isPrimeNumber2(input);
		//boolean result=isPrimeNumber3(input);
		
		/*if(result)
			System.out.println("Given number is prime");
		else
			System.out.println("Given number isnot prime");*/
		
		String result=isPrimeNumber4(input);
		System.out.println(result);
		
		
	}//main()
	
	public static boolean isPrimeNumber1(int input) {
		
		System.out.println("PrimeNumberTest.isPrimeNumber1()");
		int sqrt= (int) Math.sqrt(input)+1;
		
		for(int i=2;i<sqrt;i++) {
			if(input %i==0)
				return false;
		}
		return true;
		
	}//isPrimeNumber1()
	
	public static boolean isPrimeNumber2(int input) {
	
		System.out.println("PrimeNumberTest.isPrimeNumber2()");
		
		if(input %2==0 ||input %3==0||input %5==0||input %7==0)
			return false;
		
		return true;
	}
	
	public static boolean isPrimeNumber3(int input) {
		
		System.out.println("PrimeNumberTest.isPrimeNumber3()");
		
		if(input==2 || input==3)
			return true;
		
		if(input %2==0)
		   return false;
		
		int sqrt= (int )Math.sqrt(input) +1;
		//if no is not divisible by 2 then no need to check for even numbers
		
		for(int i=3;i<sqrt;i=i+2) {
			
			if(input %i==0)
				return false;
		}
		
		return true;
	}
	//need to check once
	public static String isPrimeNumber4(int input) {
		
		System.out.println("PrimeNumberTest.isPrimeNumber4()");
		
		if(input <0)
			return "Invalid number: Prime numbers are always naturals..";
		

		if(input ==0 || input ==1)
			return "Given number isnot Prime number";
		
		if(input ==2 || input ==3)
			return "Given number is Prime number";

		if((input * (input-1) )% 24==0 || (input * (input-1) )% 14==0 || (input * (input-1) )% 5==0  )
			return "Given number isnot Prime number";
		else
			return "Given number is Prime number";
	}
	
	public static void isPrime(int input) {

		int i=0,loopCount=0;
		System.out.println("Enter the number:");
		boolean flag=true;
			
		for( i=2;i<input;i++) { //i=2;i<=input/2;i++
			loopCount++;	
			if(input % i==0) {
				flag=false;
				break;
			}//if
		   
		}//for
		
		if(flag)
		      System.out.println(input +"  is prime number");
		else
			 System.out.println(input +"  is not prime number which is divided by :"+i);
		
		System.out.println("Loop runs for iterations:"+ loopCount);
	}

}//class
