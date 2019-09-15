package com.app.logical.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MinMaxElementTest {

	public static void main(String[] args) {
		
		getMinMax();
		//getMinMaxElement();
		//getMinMaxUsingArraysClass();
		//getMinMaxElementUsinglinkedHashmap();
	}
	public static void getMinMax(){

		int arr[]=new int[] {4,8,3,20,12,15,2,-3,44};
		int max,min,len;
		
		max=arr[0];
		len=arr.length;
		for(int i=1;i<len;i++) {
			if(max < arr[i])
			max=arr[i];
		}//for
		System.out.println("Max Element:" + max);
		
		min=arr[0];
		
		for(int i=1;i<len;i++) {
			if(min > arr[i])
			min=arr[i];
		}//for
		System.out.println("Max Element:" + min);
		
	}
	public static void getMinMaxElement() {
		
		int arr[]=new int[] {4,8,3,20,12,15,2,-3,44};
		
		//get length of array
		int len=arr.length;
		
		for(int i=0; i<len;i++) {
			int temp=0;
			for(int j=i+1;j<len;j++) {
				
				if(arr[i] > arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}//if
			}//inner for
		}//outer for
		
		
		System.out.println("Min Element:"+ arr[0]);
		System.out.println("Max Element:"+ arr[len-1]);
		
		//array after sorting
		System.out.println("Elements after sorting.");
		for(int value:arr) {
			System.out.print(value+"  ");
		}//for (enhanced)
		
	}//getMinMaxElement()

	public static void getMinMaxUsingArraysClass() {
		
		int arr[]=new int[] {4,8,3,20,12,15,2,-3,44};
		int len=arr.length;
		Arrays.sort(arr);
		
		System.out.println("Min Element:"+ arr[0]);
		System.out.println("Max Element:"+ arr[len-1]);
		
	}//getMinMaxUsingArraysClass()
	
	public static void getMinMaxElementUsinglinkedHashmap() {
		
		int arr[]=new int[] {4,8,3,20,12,15,2,-3,44};
		
		//set for storing elements
		Set<Integer> set=new TreeSet<>();
		
		for(int value:arr) {
			set.add(value);
		}//for
		
	  System.out.println(set);
	  
	  List list=new ArrayList(set);
	  
	  System.out.println("Min Element:"+ list.get(0));
	  System.out.println("Max Element:"+ list.get(list.size()-1)); 
	  
	}//
}//class
