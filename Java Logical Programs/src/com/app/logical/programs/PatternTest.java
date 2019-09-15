package com.app.logical.programs;

import java.util.Scanner;

public class PatternTest {

	public static void main(String[] args) {

		//pattern1();
			
		pattern2();
	}//main()

	public static void pattern1() {
		int number=0;
		Scanner sc=null;
		sc=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		number=sc.nextInt();
		
		
		for(int i=1;i<=number;i++) {
			
			for(int j=number-i;j>=1; j--) {
				
				System.out.print(" ");
			}//inner for
			
			for(int k=1;k<=i;k++) {
			
				System.out.print(k);
			}
			
			System.out.println();
		}//outer for

	}//pattern1()
	
	public static void pattern2() {
		
		int number;
		
		Scanner sc=null;
		sc=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		number=sc.nextInt();
		
		
		for(int i=1; i<=number;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(j);
			}//inner for
			//for next line
			System.out.println();
		}//outer for
	}//pattern2()
	
}//class
