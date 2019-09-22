package com.app.logical.programs;

import java.util.Arrays;

public class FindNumber {

	public static void main(String[] args) {

		//method1();
		method2();
	}

	public static void method1() {
		int input[] = new int[] { 2, 44, 663, 24, 972, 134, 777 };
     
		//sorting the array
		Arrays.sort(input);
		
		System.out.println("input:"+ Arrays.toString(input));
		System.out.println("Second Highest No Is:"+ input[input.length-2]);
	}
	public static void method2() {
		
		int input[] = new int[] { 2, 44, 663, 24, 972, 134, 777 };
	     
		System.out.println("input:"+ Arrays.toString(input));
		
		  for(int i=0;i<input.length;i++) {
			  
			  for(int j=i+1;j<input.length;j++) {
				  if(input[i] < input[j]) {
					  int temp=input[i];
					  input[i]=input[j];
					  input[j]=temp;
				  }//if
				  
			  }//for
			  //to minimize the iterations of for loop
			  if(i==1) {
				  System.out.println("2nd High NO:"+ input[i]);
				  break;
			  }
		  }//for
		
		 // System.out.println("output:"+ Arrays.toString(input));
		  //System.out.println("Second higest no:"+ input[1]);
	}//method2()

}//class
