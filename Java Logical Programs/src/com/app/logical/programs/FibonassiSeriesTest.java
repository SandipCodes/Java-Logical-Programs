package com.app.logical.programs;

import java.util.Scanner;

public class FibonassiSeriesTest {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int i=0,upper,next=0,pre=0,curr=0;
     
		 System.out.println("Enter the Upper limit of Fibo Ser.:");
		 
		upper=sc.nextInt();
		
		for(i=0;i<=upper;i++) {
			 
			if(i <=1) {
				System.out.print(i+" ");
				pre=0;
				curr=i;
			}
			else {
				next=pre+curr;
				pre=curr;
				curr=next;
				System.out.print(next+" ");

			}
			
		}//for
		
	}//main

}//class
