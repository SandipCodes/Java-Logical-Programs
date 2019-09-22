package com.app.logical.programs;

import java.util.Scanner;

public class ArmstrongTest {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number::");
		String input=sc.next();
		
		int len=input.length();
		
		int no=Integer.parseInt(input);
		int number=no;
		
	    double result=0;
	    
		while(no >0) {
	        
			int temp=no % 10;
			no=no/10;
			
			 //using Math.pow()
			//result= result+ Math.pow(temp,len);
			int digitPow=1;
		     //without using Math.pow()
			for(int i=1;i<=len;i++) {
				digitPow=digitPow*temp;
			}
			
			result=result+ digitPow;
			
		}
		System.out.println("addition of  "+len+"th power of every digit is:"+result);
		if(number==result) {
			System.out.println("given no is ArmStrong...");
		}
		else {
			System.out.println("given no isnot  ArmStrong...");
		}
		
		
	}

}
