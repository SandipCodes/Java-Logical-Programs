package com.app.logical.programs;

import java.util.Scanner;

public class StringReverseTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to Reverse:");
		String str = sc.next();

		// char ch1=new char(s1.length());-->wrong statement
		//method1
		  //reverseMethod1(str);
		// method2
		    //reverseMethod2(str);

		//method3
		 reverseMethod3(str);
	}// main

	// method 1
	public static void reverseMethod1(String str) {

		char ch[] = str.toCharArray();
		int len = str.length();
		String s2="";
		
		for(int i=len-1;i>=0;i--) {
    
         s2+=ch[i];
    	 //System.out.println(ch[i]);
    }
		System.out.println(s2);
	}

	//method2
	public static void reverseMethod2(String str) {
		char ch[] = str.toCharArray();
		int len = str.length();

		for (int i = 0, j = len - 1; i < j; i++, j--) {
			// System.out.print(ch[i]);
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		} // for

		System.out.println(ch);
		//String s2 = new String(ch);
		//System.out.println(s2);
	}
	
	public static void reverseMethod3(String str) {
	
	    	String reverse="";
		int len=str.length();
		
		for(int i=len-1;i>=0;i--) {
		    reverse +=str.charAt(i);
		}//for
		
		System.out.println(reverse);
		
	}//reverseMethod3()
}// class
