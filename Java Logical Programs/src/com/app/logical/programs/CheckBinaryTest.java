package com.app.logical.programs;

import java.util.Scanner;

public class CheckBinaryTest {

	public static void main(String[] args) {

		// method1();

		//method2();
	
	}// main()


	public static void method2() {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number:");
		int number = sc.nextInt();
		int copy=number;
        boolean flag=true;
        
		System.out.println("CheckBinaryTest.method1()");

		while(copy !=0) {
			
			if(copy % 10 > 1) {
				flag=false;
				break;
			}
			else {
				copy=copy/10;
				
			}
			
		}//while
		
		if(!flag) {
			System.out.println(number+ " is not binary..");
		}
		else {
			System.out.println(number+ " is  binary..");
		}

	}//method2()
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter the number:");
		String number = sc.next();
		int len = number.length();
		int i = 0;
		boolean flag = false;

		while (i < len) {

			if (number.charAt(i) == '0' || number.charAt(i) == '1') {
				flag = true;
				i++;
				continue;
			} else {
				break;
			}
		} // while

		if (flag) {
			System.out.println(number + " is binary:");
		} else {
			System.out.println(number + " isnot binary:");
		}

	}
}// class
