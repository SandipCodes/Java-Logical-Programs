/*
 * 
 * progrma to check whether given no is power of 2 or not
 * 
 */
package com.app.logical.programs;

import java.util.Scanner;

public class PowerOfTwoTest {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		
		//boolean result=checkPower(number);
		//optiomized way using bitwise operators
		//boolean result=isPowerOf2(number);
		
		//boolean result=isPowerOf2UsingBrutForce(number);
		
		boolean result=isPowerOf2Method2(number);
		
		if(result) {
			System.out.println(number + " is a power of 2");
		}
		else {
			System.out.println(number + " isnot a power of 2");
		}
	}
	
	//using bitwise 1s complement
	public static boolean isPowerOf2(int number) {
		
		System.out.println("PowerOfTwoTest.isPowerOf2()");
		if(number <0)
			throw new IllegalArgumentException("number:"+number);
		
		if((number & -number)==number)
			return true;
		
		return false;
	}
	
	//using  bitwise ops number -1
		public static boolean isPowerOf2Method2(int number) {
			
		  System.out.println("PowerOfTwoTest.isPowerOf2Method2()");
			if(number <0)
				throw new IllegalArgumentException("number:"+number);
			
			return((number & (number-1))==0);
			
		}
		
	//brute force
	public static boolean isPowerOf2UsingBrutForce(int number) {
	
		System.out.println("PowerOfTwoTest.isPowerOf2UsingBrutForce()");
		int squre=1;
		
		while(number >=squre) {
			
			if(number==squre) {
				return true;
			}
			squre= squre*2;
		}//while
	   return false;
	}
	public static boolean checkPower(int number) {
		
		System.out.println("PowerOfTwoTest.checkPower()");
		int i=0;
		String temp="";
		String binary="";
		boolean flag=false;
		while(number >0 ) {
			temp=temp+ number%2;
			number=number/2;
			
		}//while
		int len=temp.length();
		
		for(i=len-1;i>=0;i--) {
			binary +=temp.charAt(i);
		}//while
		
		for(i=0;i<len;i++) {
			
			if(binary.charAt(0)=='1') {
				i++;
				while(i < len) {
					if(binary.charAt(i)=='0') {
						i++;
						flag=true;
						continue;
					}//if
					else {
						flag=false;
						return flag;	//for false	
					}
				
				}//while
			
			}//if
			else {
				flag=false;
				return flag; //for false
			}
		
		}//for
		return flag;//for true
	}//method

}//class
