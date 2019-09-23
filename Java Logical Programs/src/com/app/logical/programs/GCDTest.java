package com.app.logical.programs;

import java.util.Scanner;

public class GCDTest {

	public static void main(String[] args) {

//		getGCD();
		
		
		getGCDRecursive();

	}

	public static void getGCDRecursive() {

		Scanner sc = new Scanner(System.in);

		int num1, num2;

		System.out.println("Enter num1:");
		num1 = sc.nextInt();
		System.out.println("Enter num2:");
		num2 = sc.nextInt();

		System.out.println("GCD USING RECURSION:");
		System.out.println("GCD OF  " + num1 + "  & " + num2 + "  is:"+returnGCDRec(num1,num2));

	}
	public static int returnGCDRec(int num1,int num2) {
		
		if(num2==0) 
			return num1;

		return ( returnGCDRec(num2 , num1%num2));
	}

	public static void getGCD() {

		Scanner sc = new Scanner(System.in);

		int num1, num2;

		System.out.println("Enter num1:");
		num1 = sc.nextInt();
		System.out.println("Enter num2:");
		num2 = sc.nextInt();

		System.out.println("GCD OF  " + num1 + "  & " + num2 + "  is:");

		while (num2 != 0) {

			int temp = num1;
			num1 = num2;
			num2 = temp % num2;
		} // while

		System.out.print(num1);
	}// getGCD()

}
