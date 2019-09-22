package com.app.logical.programs;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
		
		int input=0,i=0,loopCount=0;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		input=sc.nextInt();
		
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
	}//main()

}//class
