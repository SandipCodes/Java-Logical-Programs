package com.app.logical.programs;

import java.util.Scanner;

public class PalindromeTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String/Number::");
		String input=sc.next();
		String reverse="";
		int len=input.length();
		
		for(int i=len-1;i>=0;i--) {
			reverse +=input.charAt(i);
		}//for
		
		System.out.println("input: "+ input);
		System.out.println("reverse: "+ reverse);
		
		if(input.equalsIgnoreCase(reverse)) {
			System.out.println("So..Given String/Number is palindrome..");
		}
		else{
			System.out.println("So..Given String/Number isnot  palindrome..");
		}
	}//main()

}//class
