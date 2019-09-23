package com.app.logical.programs;

import java.util.Scanner;

public class FibonassiSeriesTest {

	public static void main(String[] args) {
        
		//iterativeApproach();
		recursiveApproach();
	}//main

	public static void recursiveApproach() {
	
		Scanner sc=new Scanner(System.in);
		int no=0;
     
		 System.out.println("Enter the Upper limit of Fibo Ser.:");
	    	no=sc.nextInt();
		
		for(int i=1;i<=no;i++) {
		  System.out.print(fibo(i)+ " ");	
		}
	
	}
	public static int fibo(int no) {
	
	
		if(no ==1 || no==2)
			return 1;
		
		return(fibo(no-1)+ fibo(no-2));
	}//fibo()
	
	
	public static void iterativeApproach() {
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
		

	}
}//class
