package com.app.logical.programs;

import java.util.Scanner;

public class SquareRootTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		int before=0,after;
		int i=0;
		
		for(i=1;i<=number;i++) {
			
			if(((i*i) < number )&& ((i+1)*(i+1)) > number ) {
		
				before=i;
				after=i+1;
				break;
			}//if
		}//for
		
	
		float divide=number/ before;
		float avg=(before+divide)/2;
	
		while(number != avg*avg) {
			  divide=number/avg;
		      avg=(avg+divide)/2;
		}
		
		System.out.println("sqrt of:"+number + "  is :"+avg);
		
	}// main()

}// class
