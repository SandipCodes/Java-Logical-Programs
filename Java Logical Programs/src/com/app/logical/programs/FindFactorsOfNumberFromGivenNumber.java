package com.app.logical.programs;

import java.util.Scanner;

public class FindFactorsOfNumberFromGivenNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		System.out.println("Find the factors of:");
		int factorsOf=sc.nextInt();
		
		findFactors(number,factorsOf);
	}
	public static void findFactors(int number,int factorsOf){
		System.out.println("FindFactorsOfNumberFromGivenNumber.findFactors()");
		int factors=0;
		int temp=number;
		
		while(number > 0) {
		   number=number /	factorsOf;
		   factors += number;
		}//while
		
		System.out.println("factorsOf :"+ factorsOf + " in "+temp+"! is :"+factors );
	}//findFactors()

}//class
