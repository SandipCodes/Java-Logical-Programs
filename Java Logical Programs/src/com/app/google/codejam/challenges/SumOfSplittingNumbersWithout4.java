package com.app.google.codejam.challenges;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfSplittingNumbersWithout4 {

	public static void main(String[] args) {
		
		sumWithout4DigitOptimized();
	}//main

	public static void sumWithout4DigitOptimized() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		String number=sc.next();
		String lower="";
		
		int len=number.length();
		int i=0;
		
		for( i=0;i<len;i++) {
			lower=lower+'0';
		}//for
		char ch1[]=number.toCharArray();
		char ch2[]=lower.toCharArray();
		
		for( i=0;i<len;i++) {
			
			if(ch1[i]=='4') {
				ch1[i]='3';
				ch2[i]='1';
			}//if
			
		}//for
		
		number=String.valueOf(ch1);
		//lower=String.valueOf(ch2);
		
		System.out.println("Num1:"+number);
		System.out.print("num2:");
		
		
		//for skipping the prefixed 0's of number 
		for( i=0;ch2[i]=='0' && i<len;i++) {
			/*
			if(ch2[i]!='0')
			break;*/
		}

		for(;i<len;i++) {
		 System.out.print(ch2[i]);	
		}//for
		//number=Arrays.toString(ch1);  not useful here need to think
		//lower=Arrays.toString(ch2);
	
	} 
	public static void sumWithout4Digit() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		int x=0, y=0,sum=0,digit=0;
	    int lower=0,upper=number,outer=0;
	        
	label: for(int i=1;i<=number;i++) {
		      outer++;
		     sum=lower+upper;
              x=lower;
              y=upper;
              
			//checking x is containing 4 in it
			  while(x > 0) {
				  digit=x % 10;
				  x=x/10;
				  
				  if(digit==4) {
					  lower++;
					  upper--;
					  continue label;
				  }//if
				  //System.out.println("while1");
			  }//while
			
			//checking y is containing 4 in it
			  while(y > 0) {
				  digit=y%10;
				  y=y/10;
				  
				  if(digit==4) {
					  lower++;
					  upper--;
					  continue label;
				  }//if
				  //System.out.println("while2");
			  }//while
			
			  System.out.println("lower:"+ lower+ " upper: "+upper +"  sum :"+sum+ " outer:"+outer);
			  break;
		}//for
	}
}//class
