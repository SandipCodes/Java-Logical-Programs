package com.app.logical.programs;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayReversalTest {

	public static void main(String[] args) {

	    //reverseArrayUsingExtraMemory();
		//reverseArrayWithoutUsingExtraMemory();
	   
		reverseArrayUsingIoStreams();
	}
	public static void reverseArrayUsingExtraMemory() {
		
		int input[]=new int[] {1,2,3,4,5,6,7,8};
	    int len=input.length;
	    int output[]=new int[len];
		
		for(int i=len-1,j=0;i>=0;i--,j++) {
		
			output[j]=input[i];
		}//for
		/*
		System.out.print("input: ");
		for(int i=0;i<len;i++) {
	
			System.out.print(input[i]+",");
		}
	
		System.out.print("\noutput:");
		for(int i=0;i<len;i++) {
			
			System.out.print(output[i]+",");
		}
	
	*/
		System.out.println("input:"+ Arrays.toString(input));
		System.out.println("output:"+ Arrays.toString(output));
		
	}//reverseArrayUsingExtraMemory

	public static void reverseArrayWithoutUsingExtraMemory() {
		
		int input[]=new int[] {1,2,3,4,5,6,7,8};
	    int len=input.length;
	    int temp;
	    
	    System.out.println("input:");
	    for(int i:input) {
	    	System.out.print(i+",");
	    }//for
	    
	    
	    for(int i=0,j=len-1; i<j;i++,j--) {
	    	temp=input[i];
	    	input[i]=input[j];
	    	input[j]=temp;
	    }//for
	    

	    System.out.println("\noutput:"); 
	    for(int i:input) {
	    	System.out.print(i+",");
	    }//for
		
	}//reverseArrayWithoutUsingExtraMemory()
	
	public static void reverseArrayUsingIoStreams(){
		

		int input[]=new int[] {1,2,3,4,5,6,7,8};
	    int len=input.length;
	    
	    System.out.println("input:"+ Arrays.toString(input));
		Object[] revArr= IntStream.rangeClosed(1,len)
		         .mapToObj(i -> input[len-i])
		         .toArray();
	
		System.out.println("output:"+ Arrays.toString(revArr));
	}//reverseArrayUsingIoStreams()
}//class
