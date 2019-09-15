package com.app.logical.programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {
	
	
		//findDuplicateElementsInArray();
		
		findDuplicateElementsInArrayUsingHashMap();
		

	}
	

	public static void findDuplicateElementsInArray() {
	
		int arr[]=new int[]{1,2,3,5,5,6,7,6,2};
		int checkedElement[]=new int[arr.length];
		
		//char ch[]=new char[9];
		//System.out.println("Input array is:"+ arr);
	label:	for(int i=0;i<arr.length;i++) {
			 int no=arr[i];
			 
			   for(int k:checkedElement) {
				   
				   if(no==checkedElement[k]) {
			         continue label;		   
				   }
			   }
			   checkedElement[i]=no;
			   
			 int count=1;
		
			 for(int j=0;j<arr.length;j++) {
			
				if(i != j) {
					if(no==arr[j]) {
						count++;
						
						if(count > 1) {
							System.out.println("Element "+no+ " is duplicate ,occured for "+ count+ " times");
						   break;
						}
					}//if
				}//if
				
			}//inner for
			
			
		}//outer
		
	}//method

	public static void findDuplicateElementsInArrayUsingHashMap(){
		
		int arr[]=new int[]{1,2,3,5,5,2,6,7,6,2,5,5};
		
		Map<Integer,Integer> map=new HashMap<>();
		
		
		for(int no:arr) {
			
			if(!map.containsKey(no)) {
				map.put(no, 1);
			}
			else {
				int count=map.get(no);
				map.put(no, ++count);
			}
		}
		System.out.println(map);
	
		//traversing the map
		Iterator itr=map.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer,Integer> element=(Entry<Integer, Integer>) itr.next();
			
			if(element.getValue() > 1) {
				System.out.println("Element "+ element.getKey()+ " is duplicated and Occurred for "+ element.getValue()+ "  times");
			}//if
		}//while
		
	}//findDuplicateElementsInArrayUsingHashMap()
	
}//class
